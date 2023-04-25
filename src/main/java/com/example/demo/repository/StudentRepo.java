package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>  {

	

	List<Student> findByStudentNameContaining(String studentName);
	List<Student> findByStandard(int standard);
	
}
