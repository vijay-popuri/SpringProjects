package com.example.SpringSecurityDemo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringSecurityDemo.model.Employee;

public interface EmployeeInterface extends CrudRepository<Employee, Integer>{

}
