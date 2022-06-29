package com.BenGarza.capstone.Controllers;

import com.BenGarza.capstone.Models.Student;
import org.springframework.ui.Model;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {

    @GetMapping("/studentinfo")
    public String logStudentInfo(Model model){
        Student student = new Student( "test@gmail.com", "Ben",  "password");
        model.addAttribute("stu", student);
            log.info("we did it");
        return "students";
    }
}
