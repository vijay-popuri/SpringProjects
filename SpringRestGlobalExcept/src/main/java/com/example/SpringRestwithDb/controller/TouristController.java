package com.example.SpringRestwithDb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringRestwithDb.model.Tourist;
import com.example.SpringRestwithDb.service.TouristService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TouristController {
	
	@Autowired
	private TouristService ser;
	
	@PostMapping("/register")
	public ResponseEntity<String> registerTourist(@RequestBody Tourist req){
		ser.registerTheTourist(req);
		return new ResponseEntity<String>("dataSavedSuccessfully",HttpStatus.OK);
	}
	
	@GetMapping("findTourist/{id}")
	public ResponseEntity<Tourist> getTourist(@PathVariable int id) {
	   Tourist touristById = ser.getToursitByd(id);
	    return new ResponseEntity<Tourist>(touristById,HttpStatus.OK);
	}
	
	@GetMapping("findAllTourists")
	public ResponseEntity<List<Tourist>> getAllTourists() {
	   List<Tourist> touristById = ser.getAllTourists();
	    return new ResponseEntity<>(touristById,HttpStatus.OK);
	}
	
	@PutMapping("/updateTourist")
	public ResponseEntity<String> updateTouristData(@RequestBody Tourist req) {
	   String touristById = ser.updateTourist(req);
	    return new ResponseEntity<>(touristById,HttpStatus.OK);
	}
	

}
