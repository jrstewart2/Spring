package com.example.demo.student;

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
            Student jin = new Student(
                    1L,
                    "Jin",
                    LocalDate.of(2000, Month.JANUARY, 17),
                    "jin.sakai@email.com"
                );

            Student taka = new Student(
                    "Taka",
                    LocalDate.of(2002, Month.MAY, 5),
                    "taka.wakanagi@email.com"
            );

            repository.saveAll(
                    List.of(jin, taka)
            );
        };
    }
}
