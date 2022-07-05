package com.BenGarza.capstone.Configurations;

import com.BenGarza.capstone.Models.Purchase;
import com.BenGarza.capstone.Models.User;
import com.BenGarza.capstone.Repository.PurchaseRepository;
import com.BenGarza.capstone.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;

@Configuration
public class PurchaseConfig {

        @Bean
        CommandLineRunner purchaseLineRunner(PurchaseRepository repository) {
            Date date =  new Date(System.currentTimeMillis());
            return args -> {
                Purchase one = new Purchase(
                      2.99,
                       date
                );
                Purchase two = new Purchase(
                        0.99,
                        date
                );
                repository.saveAll(
                        List.of(one,two)
                );
            };
        }
    }


