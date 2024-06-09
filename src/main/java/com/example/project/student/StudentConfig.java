package com.example.project.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student irakiza = new Student(
                    "IRAKIZA",
                    "irakiza44@gmail.com",
                    LocalDate.of(1997, Month.DECEMBER, 20)
            );

            Student ineza = new Student(
                    "INEZA",
                    "ineza44@gmail.com",
                    LocalDate.of(2007, Month.OCTOBER, 25)
            );

            repository.saveAll(List.of(irakiza, ineza));
        }; 
    }
}
