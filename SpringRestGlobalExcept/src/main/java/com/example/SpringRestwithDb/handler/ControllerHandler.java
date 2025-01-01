package com.example.SpringRestwithDb.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.SpringRestwithDb.exception.TouristNotFoundException;

@RestControllerAdvice
public class ControllerHandler {
	
	@ExceptionHandler(TouristNotFoundException.class)
	public ResponseEntity<ErrorCodes> handleTouristException(TouristNotFoundException tnf){
		ErrorCodes error=new ErrorCodes("404 found",tnf.getMessage(), LocalDateTime.now());
		return new ResponseEntity<>(error, HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorCodes> handleotherException(Exception e){
		ErrorCodes error=new ErrorCodes("500 Interne server Error ",e.getMessage(), LocalDateTime.now());
		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
