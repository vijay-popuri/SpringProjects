package com.example.SpringRest1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringRest1.modal.Student;
import com.example.SpringRest1.service.StudentService;

@RestController
@RequestMapping("vijay")
public class StudentController {
	
	@Autowired
	StudentService ser;
	
	@GetMapping("/greet")
	public ResponseEntity<String> greetMe(){
		String string = ser.greetMe("vijay ");
		return new ResponseEntity<String>(string,HttpStatus.OK);
	}
	
	@GetMapping("/getStudentInfo")
	public ResponseEntity<Student> getStudentInfo(){
		Student st=new Student(1,"vijay",89);
		return new ResponseEntity<Student>(st,HttpStatus.OK);
	}
	
	@PostMapping("/storeStudent")
	public String storeStudent(@RequestBody Student st){

		System.out.println(st);
		return "data saved";
	}


}
