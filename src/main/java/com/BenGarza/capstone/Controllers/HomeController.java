package com.BenGarza.capstone.Controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {

    @GetMapping("/studentinfo")
    public String logStudentInfo(){
            log.info("we did it");
        return "students";
    }
}
