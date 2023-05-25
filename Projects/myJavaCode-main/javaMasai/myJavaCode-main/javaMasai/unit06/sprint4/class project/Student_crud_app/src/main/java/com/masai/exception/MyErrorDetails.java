package com.masai.exception;

import java.time.LocalDateTime;

public class MyErrorDetails {

	
	private LocalDateTime timestamp;
	private String message;
	private String details;
	
	
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "MyErrorDetails [timestamp=" + timestamp + ", message=" + message + ", details=" + details + "]";
	}
	
	
	
	
	
}
