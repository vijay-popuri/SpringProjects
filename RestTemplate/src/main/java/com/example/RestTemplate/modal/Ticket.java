package com.example.RestTemplate.modal;

public class Ticket {
	private int ticketId;
	private String name;
	private String email;
	private String mobile;
	private String departure;
	private String arrival;
	private String status;
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Ticket(int ticketId, String name, String email, String mobile, String departure, String arrival,
			String status) {
		super();
		this.ticketId = ticketId;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.departure = departure;
		this.arrival = arrival;
		this.status = status;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}
