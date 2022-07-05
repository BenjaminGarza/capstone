package com.BenGarza.capstone.Configurations;

import com.BenGarza.capstone.Models.Course;
import com.BenGarza.capstone.Models.Lesson;
import com.BenGarza.capstone.Repository.CourseRepository;
import com.BenGarza.capstone.Repository.LessonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CourseConfig {

    @Bean
    CommandLineRunner courseLineRunner(CourseRepository repository) {
        return args -> {
            Course one = new Course(
                    "Game dev",
                    1.99,
                    "Make the game you've always needed"
            );
            Course two = new Course(
                    "How to clean",
                    2.99,
                    "Out of the box techniques to make cleaning fun!"
            );
            repository.saveAll(
                    List.of(one, two)
            );
        };
    }
}
