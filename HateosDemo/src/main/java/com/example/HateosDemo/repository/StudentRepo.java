package com.example.HateosDemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.HateosDemo.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
