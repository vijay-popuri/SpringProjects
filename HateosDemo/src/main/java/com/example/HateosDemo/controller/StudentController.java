package com.example.HateosDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.HateosDemo.model.Student;
import com.example.HateosDemo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService ser;
	
	@PostMapping("create-student")
	public ResponseEntity<String> uploadStudentInf(@RequestBody Student st){
		String data=ser.storeData(st);
		return new ResponseEntity<String>(data,HttpStatus.CREATED);
	}
	
	@GetMapping("getStudent/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable int id) {
		Student student = ser.getStudentById(id);
		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(StudentController.class).getAllStudents())
				.withRel("click to see all students");
		student.add(link);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	
	@GetMapping("getAllStudents")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> students = ser.getAllStudents();
		return new ResponseEntity<>(students,HttpStatus.OK);
	}

}
