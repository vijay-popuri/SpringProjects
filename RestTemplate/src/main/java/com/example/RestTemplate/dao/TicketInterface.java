package com.example.RestTemplate.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.RestTemplate.modal.Passenger;

@Repository
public interface TicketInterface extends CrudRepository<Passenger, Integer>{

}
