package com.javacodes.RestAPI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.javacodes.example.model.Student;
import com.javacodes.example.repository.StudentRepository;

@SpringBootApplication
public class RestApiApplication {
	CommandLineRunner init(StudentRepository repo) {
		return args -> {
			repo.save(new Student(1,"a", 90));
			repo.save(new Student(2,"b", 92));
			repo.save(new Student(3,"c", 86));
			repo.save(new Student(4,"d", 80));
			repo.save(new Student(5,"e", 94));
		};
	}
		public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}
}
