package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {

        return args -> {
            Student mariam= new Student(

                "mariam",

                "mariam@yaho.com",
                LocalDate.of(2000, JANUARY, 5),
                30


            );

            Student hauwa= new Student(

                    "hauwa",

                    "hauwa@yahoo.com",
                    LocalDate.of(2020, JANUARY, 5),
                    21


            );
            repository.saveAll(
                    List.of(hauwa, mariam)

            );


        };
    }
}
//    ArrayList<Student> car =new ArrayList<Student>(
////				1L,
////				"papa",
////				"papadgenius@yaho.com",
////				LocalDate.of(2000, Month.JANUARY, 5),
////				21
//
//    );
//
//        return List.of( new Student(
//                1L,
//                "papa",
//
//                "papadgenius@yaho.com",
//                LocalDate.of(2000, Month.JANUARY, 5),
//                21
//
//                ));