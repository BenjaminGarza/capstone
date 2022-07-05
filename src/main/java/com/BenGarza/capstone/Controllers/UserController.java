package com.BenGarza.capstone.Controllers;

import com.BenGarza.capstone.Models.User;
import com.BenGarza.capstone.Services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@Slf4j
public class UserController {

    private final UserService studentService;

    @Autowired
    public UserController(UserService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/userinfo")
    public List<User> getUsers(Model model){
      //  User user = new User( "test@gmail.com", "Ben",  "password");
       // model.addAttribute("stu", user);
        log.info("we did it");
        return studentService.getUsers();

    }
}
