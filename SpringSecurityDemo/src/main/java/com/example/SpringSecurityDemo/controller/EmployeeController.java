package com.example.SpringSecurityDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringSecurityDemo.model.Employee;
import com.example.SpringSecurityDemo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService ser;
	
	@PostMapping("/addEmployee")
	public ResponseEntity<String> addEmployee(@RequestBody Employee emp){
		String employee = ser.addEmployee(emp);
		return new ResponseEntity<String>(employee, HttpStatus.CREATED);
	}
	
	@GetMapping("/getEmployeeById/{id}")
	public ResponseEntity<Employee> addEmployee(int id){
		Employee employee = ser.getEmployeeById(id);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
	
	@GetMapping("/getAllEmps")
	public ResponseEntity<List<Employee>> addEmployee(){
		List<Employee> employee = ser.getAllEmployee();
		return new ResponseEntity<>(employee, HttpStatus.CREATED);
	}

}
