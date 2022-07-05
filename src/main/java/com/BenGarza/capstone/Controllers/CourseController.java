package com.BenGarza.capstone.Controllers;

import com.BenGarza.capstone.Models.Course;
import com.BenGarza.capstone.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courseinfo")
    public List<Course> getCourses(Model model){
        //  User user = new User( "test@gmail.com", "Ben",  "password");
        // model.addAttribute("stu", user);
        return courseService.getCourses();

    }
}
