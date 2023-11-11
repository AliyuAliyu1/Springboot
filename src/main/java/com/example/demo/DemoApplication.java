package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}
	@GetMapping
	public List<Student> supp (){
		ArrayList<Student> car =new ArrayList<Student>(
//				1L,
//				"papa",
//				"papadgenius@yaho.com",
//				LocalDate.of(2000, Month.JANUARY, 5),
//				21

		);

		return List.of( new Student(
				1L,
  			"papa",

				"papadgenius@yaho.com",
			          LocalDate.of(2000, Month.JANUARY, 5),
			21

		));
	}

}
