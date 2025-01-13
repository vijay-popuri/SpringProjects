package com.example.SpringSecurityDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private String email;
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
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	public Employee(int id, String name, String email, String loc) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.loc = loc;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
