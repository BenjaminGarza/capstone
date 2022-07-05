package com.BenGarza.capstone.Services;

import com.BenGarza.capstone.Models.Course;
import com.BenGarza.capstone.Models.Lesson;
import org.springframework.stereotype.Service;

import java.util.List;
import com.BenGarza.capstone.Models.Course;
import org.springframework.stereotype.Service;

@Service
public class LessonService {






        public List<Lesson> getLessons(){


            return (List<Lesson>) List.of(
                    new Lesson(
                            "Lesson 1",
                            false,
                            "www.youtube.com"

                    )
            );
        }


    public void addNewLesson(Lesson lesson) {
        System.out.println(lesson);
    }
}
