package com.example.SpringRestwithDb.exception;

public class TouristNotFoundException extends RuntimeException {
	public TouristNotFoundException(String msg){
		super(msg);
	}

}
