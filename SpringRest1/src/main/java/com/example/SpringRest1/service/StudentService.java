package com.example.SpringRest1.service;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	public String greetMe(String str) {
		String wishes="";
		LocalTime time=LocalTime.now();
		int hrs=time.getHour();
		if(hrs<12) {
			wishes="goodMorning";
		}else if(hrs<16) {
			wishes="Good AfterNoon";
		}else if(hrs<20) {
			wishes="GoodEvening";
		}else {
			wishes="GoodNight";
		}
		
		return str+wishes;
	}

}
