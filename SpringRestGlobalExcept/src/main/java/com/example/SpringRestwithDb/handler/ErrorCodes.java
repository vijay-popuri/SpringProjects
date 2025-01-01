package com.example.SpringRestwithDb.handler;

import java.time.LocalDateTime;

public class ErrorCodes {
	
  private String statusCode;
	
	private String msg;
	
	private LocalDateTime dateTime;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public ErrorCodes(String statusCode, String msg, LocalDateTime dateTime) {
		super();
		this.statusCode = statusCode;
		this.msg = msg;
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "ErrorCodes [statusCode=" + statusCode + ", msg=" + msg + ", dateTime=" + dateTime + "]";
	}

	
}
