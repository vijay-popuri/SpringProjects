package com.example.ActualHateos.model;

import org.springframework.hateoas.RepresentationModel;

public class StudentPrivateInf {
	
	private int id;
	private String name;
	private String email;
	private String grade;
	private String loc;
	private double noOfYears;
	private String jobLoc;
	private String collage;
	private double percentage;
	private String extraActivites;
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
	public double getNoOfYears() {
		return noOfYears;
	}
	public void setNoOfYears(double noOfYears) {
		this.noOfYears = noOfYears;
	}
	public String getJobLoc() {
		return jobLoc;
	}
	public void setJobLoc(String jobLoc) {
		this.jobLoc = jobLoc;
	}
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getExtraActivites() {
		return extraActivites;
	}
	public void setExtraActivites(String extraActivites) {
		this.extraActivites = extraActivites;
	}
	public StudentPrivateInf(int id, String name, String email, String grade, String loc, double noOfYears,
			String jobLoc, String collage, double percentage, String extraActivites) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.grade = grade;
		this.loc = loc;
		this.noOfYears = noOfYears;
		this.jobLoc = jobLoc;
		this.collage = collage;
		this.percentage = percentage;
		this.extraActivites = extraActivites;
	}
	public StudentPrivateInf() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
