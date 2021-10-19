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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student bee = new Student(

                    "bee",
                    "bee.bee@gmail.com",
                    LocalDate.of(2000,Month.JANUARY,5),
                    21
            );
            Student yuuu = new Student(
                    "yuu",
                    "yuu.bee@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,5),
                    23
                    );

            repository.saveAll(
                    List.of(bee,yuuu)
            );
        };
    }
}
