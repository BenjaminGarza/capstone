package com.BenGarza.capstone.Controllers;

import com.BenGarza.capstone.Models.User;
import com.BenGarza.capstone.Services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/userinfo")
    public List<User> getUsers(Model model){
      //  User user = new User( "test@gmail.com", "Ben",  "password");
       // model.addAttribute("stu", user);
        log.info("we did it");
        return userService.getUsers();

    }
    @PostMapping("/registeruser")
    public void registerNewUser(@RequestBody User user) {
        userService.addNewUser(user);
    }
    @PutMapping(path = "{userId}")
    public void updateUser(
            @PathVariable("userId") Long userId,
            @RequestParam(required = false)String name,
            @RequestParam(required = false)String email,
            @RequestParam(required = false)String password) {
        userService.updateUser(userId,name,email,password );
    }
}
