package com.BenGarza.capstone.Controllers;

import com.BenGarza.capstone.Models.Course;
import com.BenGarza.capstone.Models.User;
import com.BenGarza.capstone.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public List<Course> getCourses(Model model){
        //  User user = new User( "test@gmail.com", "Ben",  "password");
        // model.addAttribute("stu", user);
        return courseService.getCourses();

    }
    @PostMapping("/create")
    public void registerNewCourse(@RequestBody Course course) {
        courseService.addNewCourse(course);
    }
@DeleteMapping(path = "{courseId}")
    public void deleteCourse(@PathVariable("courseId") Long courseId) {
        courseService.deleteCourse(courseId);
}

@PutMapping(path = "{courseId}")
    public void updateCourse(
            @PathVariable("courseId") Long courseId,
            @RequestParam(required = false)String name,
            @RequestParam(required = false)String description,
            @RequestParam(required = false)Double price) {
        courseService.updateCourse(courseId,name,description,price );
}
}
