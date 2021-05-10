package org.pierre.apmdemoclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Controller
public class ClientController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/index")
    public String showUserList(Model model) {
        ResponseEntity<EmployeeEntity[]> response = restTemplate.getForEntity("http://localhost:8082/employees/", EmployeeEntity[].class);
        EmployeeEntity[] employees = response.getBody();
        model.addAttribute("employees", Arrays.asList(employees));
        return "index";
    }
}
