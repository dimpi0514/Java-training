package com.javacodes.example.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.javacodes.example.model.Student;

@Repository
public class StudentRepository {
	
	HashMap students = new HashMap();
	int currentid = 100;
	
	public Collection findAll() {
		return students.values();
	}
	
	public Optional findByid(Long id) {
		Student student = null;
		
		if (students.containsKey(id)) student = (Student) students.get(id);
		return Optional.ofNullable(student);
	}
	public Student save(Student student) {
		student.setId();
		students.put(student.getId(), student);
		return student;
	}
	
	public Optional update(Student student) {
		Student currentStudent = (Student) students.get(student.getId());
		
		if(currentStudent != null) {
			students.put(student.getId(), student);
			currentStudent = (Student) students.get(student.getId());	
		}
		return Optional.ofNullable(currentStudent);
	}
	
	public Optional delete(Long id) {
		Student currentStudent = (Student) students.get(id);
		
		if(currentStudent != null) {
			students.remove(id);
		}
		return Optional.ofNullable(currentStudent);
	}

}
