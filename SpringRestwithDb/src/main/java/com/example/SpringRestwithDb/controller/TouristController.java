package com.example.SpringRestwithDb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringRestwithDb.modal.Tourist;
import com.example.SpringRestwithDb.service.TouristService;

@RestController
public class TouristController {
	
	@Autowired
	TouristService ser;
	
	@PostMapping("/register")
	public ResponseEntity<String> storeTourist(@RequestBody Tourist req){
		String data=ser.storeTouristData(req);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	@GetMapping("/findTourist/{id}")
	public ResponseEntity<Tourist> getTouristBydId(@PathVariable int id){
		Tourist tourist = ser.getTrouristById(id);
		return new ResponseEntity<Tourist>(tourist,HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Tourist>> getAllTourists(){
		List<Tourist> tourists = ser.getTourists();
		return new ResponseEntity<>(tourists,HttpStatus.OK);
	}

}
