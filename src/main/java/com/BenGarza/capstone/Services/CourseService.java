package com.BenGarza.capstone.Services;

import com.BenGarza.capstone.Models.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    public List<Course> getCourses(){
        //  User user = new User( "test@gmail.com", "Ben",  "password");
        // model.addAttribute("stu", user);

        return (List<Course>) List.of(
                new Course(
                        "How to Dance",
                        1.99,
                        "Really awesome course."
                )
        );
    }

    public void addNewCourse(Course course) {
        System.out.println(course);
    }
}
