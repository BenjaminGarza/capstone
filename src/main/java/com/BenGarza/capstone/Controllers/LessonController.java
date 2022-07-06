package com.BenGarza.capstone.Controllers;

import com.BenGarza.capstone.Models.Lesson;
import com.BenGarza.capstone.Models.User;
import com.BenGarza.capstone.Services.CourseService;
import com.BenGarza.capstone.Services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
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
    @PostMapping("/registerlesson")
    public void registerNewLesson(@RequestBody Lesson lesson) {
        lessonService.addNewLesson(lesson);
    }

    @DeleteMapping(path = "{lessonId}")
    public void deleteLesson(@PathVariable("lessonId") Long lessonId) {
        lessonService.deleteLesson(lessonId);
    }
    @PutMapping(path = "{lessonId}")
    public void updateLesson(
            @PathVariable("lessonId") Long lessonId,
            @RequestParam(required = false)Boolean done,
            @RequestParam(required = false)String name,
            @RequestParam(required = false)String url) {
        lessonService.updateLesson(lessonId,done,name,url );
    }
}
