package com.BenGarza.capstone.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping
    String getStudents(Model model) {
        model.addAttribute("something", "This is coming from the controller");
        return "students";
    }
}
