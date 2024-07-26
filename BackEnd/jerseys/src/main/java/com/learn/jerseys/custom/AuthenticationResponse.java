package com.learn.jerseys.custom;

public class AuthenticationResponse {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public AuthenticationResponse() {
		
	}
	
	public AuthenticationResponse(String message) {
		super();
		this.message = message;
	}
	
	
}
