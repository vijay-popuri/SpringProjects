package com.example.TicketCallBack.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.TicketCallBack.modal.Passenger;

@Service
public class TicketCallBackService {
	private String url="http://localhost:8485/RestTemplate/ticket/registerPassenger";
	public Integer getTicketNum(Passenger psg) {
		 RestTemplate rt=new RestTemplate();
		 ResponseEntity<Integer> entity = rt.postForEntity(url, psg, Integer.class);
		 Integer body = entity.getBody();
		return body;
	}

}
