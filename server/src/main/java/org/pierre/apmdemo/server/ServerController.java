package org.pierre.apmdemo.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServerController {
    @Autowired
    private EmployeeRepository repository;
    static int count = 0;

    @GetMapping("/employees")
    List<EmployeeEntity> all() throws Exception {
        count++;
        if (count % 10 == 0) throw new Exception("random exception");
        if (count % 10 == 1) {
            slowMethod();
        };
        return repository.findAll();
    }

    private void slowMethod() {
        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {}
        ;
    }

    @PostMapping("/employees")
    EmployeeEntity newEmployee(@RequestBody EmployeeEntity newEmployee) {
        return repository.save(newEmployee);
    }

    @GetMapping("/employees/{id}")
    EmployeeEntity one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PutMapping("/employees/{id}")
    EmployeeEntity replaceEmployee(@RequestBody EmployeeEntity newEmployee, @PathVariable Long id) {

        return repository.findById(id)
                .map(employee -> {
                    employee.setName(newEmployee.getName());
                    employee.setRole(newEmployee.getRole());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return repository.save(newEmployee);
                });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
