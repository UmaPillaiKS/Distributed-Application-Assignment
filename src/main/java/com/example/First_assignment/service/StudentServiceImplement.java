package com.example.First_assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.First_assignment.model.Student;
import com.example.First_assignment.repository.StudentRepository;

@Service
public class StudentServiceImplement implements StudentService {
	
	@Autowired
	private StudentRepository stuRepo;
	

	@Override
	public List<Student> getAllStudents() {
		return stuRepo.findAll();
		
	}


	@Override
	public void AddStudent(Student student) {
		this.stuRepo.save(student);
		
	}
	

}
