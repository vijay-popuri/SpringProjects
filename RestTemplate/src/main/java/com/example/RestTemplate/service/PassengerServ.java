package com.example.RestTemplate.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestTemplate.dao.TicketInterface;
import com.example.RestTemplate.modal.Passenger;

@Service
public class PassengerServ {
	
	@Autowired
	private TicketInterface repo;
	
	public int registerPassenger(Passenger psg) {
		Passenger passenger = repo.save(psg);
		return passenger.getId();
	}
	
	public Passenger getPassengerById(int id) {
		return repo.findById(id).orElse(null);
		
	}

}
