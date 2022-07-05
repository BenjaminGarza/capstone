package com.BenGarza.capstone.Configurations;

import com.BenGarza.capstone.Models.User;
import com.BenGarza.capstone.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

        @Bean
    CommandLineRunner userLineRunner(UserRepository repository) {
        return args -> {
            User Ben = new User(
                    "Benjisgarza@gmail.com",
                    "Ben",
                    "SuperSecret"
            );
            User Tom = new User(
                    "Tom@gmail.com",
                    "Tom",
                    "SuperTom"
            );
    repository.saveAll(
            List.of(Ben,Tom)
    );
        };
    }
}
