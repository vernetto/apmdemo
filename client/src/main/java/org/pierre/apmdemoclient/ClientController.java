package org.pierre.apmdemoclient;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class ClientController {
    @GetMapping("/index")
    public String showUserList(Model model) {
        model.addAttribute("employees", Arrays.asList(new EmployeeEntity(1L, "Jack", "Cook"), new EmployeeEntity(2L, "Mary", "Boss")));
        return "index";
    }
}
