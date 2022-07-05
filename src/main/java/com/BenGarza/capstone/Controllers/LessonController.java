package com.BenGarza.capstone.Controllers;

import com.BenGarza.capstone.Models.Lesson;
import com.BenGarza.capstone.Services.CourseService;
import com.BenGarza.capstone.Services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class LessonController {

        private final LessonService lessonService;

        @Autowired
        public LessonController(LessonService lessonService) {
            this.lessonService = lessonService;
        }

        @GetMapping("/lessoninfo")
        public List<Lesson> getCourses(Model model){
            //  User user = new User( "test@gmail.com", "Ben",  "password");
            // model.addAttribute("stu", user);
            return lessonService.getLessons();

        }


}
