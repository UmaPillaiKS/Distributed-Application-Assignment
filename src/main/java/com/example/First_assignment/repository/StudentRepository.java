package com.example.First_assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.First_assignment.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
