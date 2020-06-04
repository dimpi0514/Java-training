package com.javacodes.example.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.javacodes.example.repository.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	private final StudentRepository repo;
	
	@Autowired
	public StudentController(StudentRepository repo) {
		this.repo= repo;
	}
	
	@ResponseStatus
	class StudentNotFoundException extends RuntimeException {
	
		public StudentNotFoundException() {
			super ("Student not exist");
		}
	}
	
	@GetMapping
	Collection readStudents() {
		return this.repo.findAll();
	}	
}
