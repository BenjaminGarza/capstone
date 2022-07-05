package com.BenGarza.capstone.Configurations;

import com.BenGarza.capstone.Models.Lesson;
import com.BenGarza.capstone.Models.User;
import com.BenGarza.capstone.Repository.LessonRepository;
import com.BenGarza.capstone.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LessonConfig {
    @Bean
    CommandLineRunner lessonLineRunner(LessonRepository repository) {
        return args -> {
            Lesson one = new Lesson(
                    "one",
                    false,
                    "www.test.com"
            );
            Lesson two = new Lesson(
                    "two",
                    false,
                    "www.test.com"
            );
            repository.saveAll(
                    List.of(one, two)
            );
        };
    }
}