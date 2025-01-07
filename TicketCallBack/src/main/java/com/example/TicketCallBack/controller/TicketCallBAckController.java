package com.example.TicketCallBack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TicketCallBack.modal.Passenger;
import com.example.TicketCallBack.service.TicketCallBackService;

@RestController
@RequestMapping("/tourist")
public class TicketCallBAckController {
	@Autowired
	private TicketCallBackService ser;
	
	@PostMapping("/registerTraveller")
	public ResponseEntity<Integer> registerCust(@RequestBody Passenger psg){
		int ticketNum = ser.getTicketNum(psg);
		return new ResponseEntity<Integer>(ticketNum, HttpStatus.CREATED);
	}
	
	

}
