package org.pierre.apmdemo.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServerController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    EmployeeRepository employeeRepository;

    static int count = 0;

    @GetMapping("/employees")
    List<EmployeeEntity> all() throws Exception {
        count++;
        if (count % 10 == 0) employeeService.throwException();
        if (count % 10 == 1) {
            employeeService.slowMethod();
        };
        return employeeService.findAll();
    }




    @PostMapping("/employees")
    EmployeeEntity newEmployee(@RequestBody EmployeeEntity newEmployee) {
        return employeeService.save(newEmployee);
    }

    @GetMapping("/employees/{id}")
    EmployeeEntity one(@PathVariable Long id) {

        return employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PutMapping("/employees/{id}")
    EmployeeEntity replaceEmployee(@RequestBody EmployeeEntity newEmployee, @PathVariable Long id) {

        return employeeRepository.findById(id)
                .map(employee -> {
                    employee.setName(newEmployee.getName());
                    employee.setRole(newEmployee.getRole());
                    return employeeRepository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return employeeRepository.save(newEmployee);
                });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        employeeRepository.deleteById(id);
    }

}
