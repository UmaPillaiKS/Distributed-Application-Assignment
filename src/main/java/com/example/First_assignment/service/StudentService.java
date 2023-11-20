package com.example.First_assignment.service;

import java.util.List;

import com.example.First_assignment.model.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	void AddStudent(Student student);

}
