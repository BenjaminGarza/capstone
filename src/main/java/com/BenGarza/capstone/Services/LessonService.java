package com.BenGarza.capstone.Services;

import com.BenGarza.capstone.Models.Course;
import com.BenGarza.capstone.Models.Lesson;
import com.BenGarza.capstone.Repository.LessonRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
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
    @Transactional
    public void updateLesson(Long lessonId, Boolean done, String name, String url) {


            Lesson lesson = lessonRepository.findById(lessonId).orElseThrow(() -> new IllegalStateException(
                    "Lesson with id" + lessonId + "does not exist."
            ));
            if (name != null &&
                    name.length() > 0 &&
                    !Objects.equals(lesson.getName(), name)){
                lesson.setName(name);
            }
            if (done != null &&
                    !Objects.equals(lesson.getDone(), done)){
                lesson.setDone(done);
            }
            if (url != null &&
                    url.length() > 0 &&
                    !Objects.equals(lesson.getUrl(), url)){
                lesson.setUrl(url);
            }

    }
}
