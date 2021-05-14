package org.pierre.apmdemo.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public void throwException() throws Exception {
        throw new Exception("random exception");
    }

    public void slowMethod() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        ;
    }

    public List<EmployeeEntity> findAll() {
        return employeeRepository.findAll();
    }

    public EmployeeEntity save(EmployeeEntity newEmployee) {
        return employeeRepository.save(newEmployee);
    }
}
