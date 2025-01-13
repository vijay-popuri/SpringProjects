package com.example.SpringSecurityDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringSecurityDemo.dao.EmployeeInterface;
import com.example.SpringSecurityDemo.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeInterface repo;
	
	public String addEmployee(Employee emp) {
		repo.save(emp);
		return "data saved";
	}
	
	public Employee getEmployeeById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public List<Employee> getAllEmployee(){
		return (List<Employee>) repo.findAll();
	}

}
