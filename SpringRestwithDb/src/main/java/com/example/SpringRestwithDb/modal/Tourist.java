package com.example.SpringRestwithDb.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tourist {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	private double amt;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	public Tourist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tourist(int id, String name, String city, double amt) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.amt = amt;
	}
	@Override
	public String toString() {
		return "Tourist [id=" + id + ", name=" + name + ", city=" + city + ", amt=" + amt + "]";
	}
	
	

}
