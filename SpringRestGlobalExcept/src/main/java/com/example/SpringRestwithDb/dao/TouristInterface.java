package com.example.SpringRestwithDb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringRestwithDb.model.Tourist;

public interface TouristInterface extends JpaRepository<Tourist, Integer> {

}
