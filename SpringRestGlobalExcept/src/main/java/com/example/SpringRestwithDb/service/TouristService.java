package com.example.SpringRestwithDb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringRestwithDb.dao.TouristInterface;
import com.example.SpringRestwithDb.exception.TouristNotFoundException;
import com.example.SpringRestwithDb.model.Tourist;

@Service
public class TouristService {
	
	@Autowired
	private TouristInterface repo;
	
	public void registerTheTourist(Tourist tr) {
		repo.save(tr);
	}
	
	public Tourist getToursitByd(int id) {
		return repo.findById(id).orElseThrow(()->new TouristNotFoundException("tousirst is not present"));
	}
	
	public String updateTourist(Tourist tr) {
		Tourist tourist = repo.findById(tr.getId()).orElseThrow(()->new TouristNotFoundException("tousirst is not present"));
		
		repo.save(tr);
		return "saved";
	}
	
	public List<Tourist> getAllTourists(){
		return repo.findAll();
	}

}
