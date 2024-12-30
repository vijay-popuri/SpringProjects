package com.example.SpringRestwithDb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringRestwithDb.modal.Tourist;

public interface ITourist extends JpaRepository<Tourist, Integer> {

}
