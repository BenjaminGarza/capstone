package com.BenGarza.capstone.Services;

import com.BenGarza.capstone.Models.Lesson;
import com.BenGarza.capstone.Models.User;
import com.BenGarza.capstone.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        //  User user = new User( "test@gmail.com", "Ben",  "password");
        // model.addAttribute("stu", user);

        return userRepository.findAll();
    }

    public void addNewUser(User user) {
        Optional<User> userOptional = userRepository
                .findUserByEmail(user.getEmail());
        if(userOptional.isPresent()) {
            throw new IllegalStateException("Email is already in use");
        }
       userRepository.save(user);
    }
    @Transactional
    public void updateUser(Long userId, String name, String email, String password) {



        User user = userRepository.findById(userId).orElseThrow(() -> new IllegalStateException(
                "User with id" + userId + "does not exist."
        ));
        if (name != null &&
                name.length() > 0 &&
                !Objects.equals(user.getName(), name)){
            user.setName(name);
        }
        if (email != null &&
                !Objects.equals(user.getEmail(), email)){
            Optional<User> userOptional = userRepository.findUserByEmail(email);
            if(userOptional.isPresent()) {
                throw new IllegalStateException("Email in use");
            }
            user.setEmail(email);
        }
        if (password != null &&
                password.length() > 0 &&
                !Objects.equals(user.getPassword(), password)){
            user.setPassword(password);
        }
    }
}
