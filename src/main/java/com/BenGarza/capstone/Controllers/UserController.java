package com.BenGarza.capstone.Controllers;

import com.BenGarza.capstone.Models.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@Slf4j
public class UserController {

    @GetMapping("/userinfo")
    public String logStudentInfo(Model model){
        User user = new User( "test@gmail.com", "Ben",  "password");
        model.addAttribute("stu", user);
        log.info("we did it");
        return "users";
    }
}
