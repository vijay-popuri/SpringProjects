package com.example.ActualHateos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ActualHateos.model.Student;
import com.example.ActualHateos.model.StudentPrivateInf;
import com.example.ActualHateos.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService ser;

	@PostMapping("/addStudent")
	public ResponseEntity<String> updateStudentData(@RequestBody Student st) {
		String data = ser.storeStudentData(st);
		return new ResponseEntity<String>(data, HttpStatus.OK);
	}
	
	@GetMapping("/getStudentData/{id}")
	public ResponseEntity<Student> getStudentData(@PathVariable int id) {
		Student student = ser.getStudentData(id);
		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(StudentController.class).getStudentPrvtInfo(id))
				.withRel("click to go personal info");
		student.add(link);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}
	
	@GetMapping("/getAllStudents")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> students = ser.getAllStudentData();
		return new ResponseEntity<>(students, HttpStatus.OK);
	}
	
	@GetMapping("/getStudentPrivatInfo/{id}")
	public ResponseEntity<StudentPrivateInf> getStudentPrvtInfo(@PathVariable int id) {
		StudentPrivateInf studentPrivateInf = ser.getStudentPrivateInf(id);
//		Link linkToGetStudentData = WebMvcLinkBuilder.linkTo(
//	            WebMvcLinkBuilder.methodOn(StudentController.class).getStudentData(id))
//	            .withRel("click to view student data");
//	    studentPrivateInf.add(linkToGetStudentData);
		return new ResponseEntity<>(studentPrivateInf, HttpStatus.OK);
	}

}
