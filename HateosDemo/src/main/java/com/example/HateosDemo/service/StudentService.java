package com.example.HateosDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HateosDemo.model.Student;
import com.example.HateosDemo.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo repo;
	
	public String storeData(Student st) {
		repo.save(st);
		return "data Saved";
	}
	
	public Student getStudentById(int id) {
		return repo.findById(id).orElse(null);
		
	}
	
	public List<Student> getAllStudents() {
		return (List<Student>) repo.findAll();
		
	}

}
