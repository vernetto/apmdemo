package org.pierre.apmdemo.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServerController {
    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/employees")
    List<EmployeeEntity> all() {
        return repository.findAll();
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
