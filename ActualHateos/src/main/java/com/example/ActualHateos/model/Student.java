package com.example.ActualHateos.model;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import jakarta.persistence.Id;

public class Student extends RepresentationModel
{

	private int id;
	private String name;
	private String email;
	private String grade;
	private String loc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Student(int id, String name, String email, String grade, String loc) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.grade = grade;
		this.loc = loc;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
