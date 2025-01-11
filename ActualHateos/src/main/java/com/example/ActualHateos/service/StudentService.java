package com.example.ActualHateos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ActualHateos.dao.StudentDao;
import com.example.ActualHateos.model.Student;
import com.example.ActualHateos.model.StudentPrivateInf;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao dao;
	
	public String storeStudentData(Student st) {
		dao.insertStudentData(st);
		return "dataSaved";
	}
	
	public Student getStudentData(int id) {
		return dao.getStudentData(id);
	}

	public List<Student> getAllStudentData(){
		return dao.getAllStudentData();
	}
	
	public StudentPrivateInf getStudentPrivateInf(int id) {
		return dao.getStudentPrivateInformation(id);
	}
}
