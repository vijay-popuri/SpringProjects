package com.example.SpringRestwithDb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringRestwithDb.dao.ITourist;
import com.example.SpringRestwithDb.modal.Tourist;

@Service
public class TouristService {
	
	@Autowired
	ITourist dao;
	
	public String storeTouristData(Tourist tr) {
		dao.save(tr);
		return "saved";
	}
	
	public Tourist getTrouristById(int id) {
	 return dao.findById(id).orElseThrow(()->new RuntimeException("it is not found"));
	 
	}
	
	public List<Tourist> getTourists() {
		return dao.findAll();
	}

}
