package com.example.RestTemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestTemplate.modal.Passenger;
import com.example.RestTemplate.modal.Ticket;
import com.example.RestTemplate.service.PassengerServ;

@RestController
@RequestMapping("/ticket")
public class PassengerController {

	@Autowired
	private PassengerServ ser;

	@PostMapping("/registerPassenger")
	public ResponseEntity<Integer> registerThePassenger(@RequestBody Passenger psg) {
		int ticketId = ser.registerPassenger(psg);
		return new ResponseEntity<>(ticketId, HttpStatus.CREATED);
	}

	@GetMapping("/getTicket/{id}")
	public ResponseEntity<Ticket> getTicketDtls(@PathVariable int id) {
		Passenger psg = ser.getPassengerById(id);
		Ticket tk = null;
		if (psg != null) {
			tk = new Ticket();
			tk.setTicketId(psg.getId());
			tk.setName(psg.getName());
			tk.setMobile(psg.getMobile());
			tk.setEmail(psg.getEmail());
			tk.setArrival(psg.getArrival());
			tk.setDeparture(psg.getDeparture());
			tk.setStatus("CONFIRMED");
		}

		return new ResponseEntity<>(tk, HttpStatus.OK);
	}

}
