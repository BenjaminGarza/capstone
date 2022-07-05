package com.BenGarza.capstone.Services;

import com.BenGarza.capstone.Models.Lesson;
import com.BenGarza.capstone.Repository.LessonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LessonService {

    private final LessonRepository lessonRepository;

    public LessonService(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }


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
        Optional<Lesson> lessonOptional = lessonRepository
                .findLessonById(lesson.getId());
        if(lessonOptional.isPresent()) {
            throw new IllegalStateException("Duplicate Lesson");
        }
        lessonRepository.save(lesson);
    }

    public void deleteLesson(Long lessonId) {

        boolean exists = lessonRepository.existsById(lessonId);
        if (!exists){
            throw new IllegalStateException("Lesson does not exist. Id:" + lessonId);
        }

        lessonRepository.deleteById(lessonId);
    }
}
