package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student khush = new Student(
				1L, 
				"Khush", 
				"khush@gmail.com", 
				LocalDate.of(2005, 1, 12) 
			);

            Student harsh = new Student( 
				"Harsh", 
				"harsh@gmail.com", 
				LocalDate.of(2001, 12, 1)
			);

            repository.saveAll(
                List.of(khush, harsh)
            );
        };
    }
}