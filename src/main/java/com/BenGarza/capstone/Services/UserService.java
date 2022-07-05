package com.BenGarza.capstone.Services;

import com.BenGarza.capstone.Models.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class UserService {
    public List<User> getUsers(){
        //  User user = new User( "test@gmail.com", "Ben",  "password");
        // model.addAttribute("stu", user);

        return List.of(
                new User(
                        "Ben@gmail.com",
                        "Ben",
                        "SuperSecret"
                )
        );
    }
}
