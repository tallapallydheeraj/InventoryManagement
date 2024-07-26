package com.learn.jerseys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.jerseys.custom.AuthenticationRequest;
import com.learn.jerseys.custom.AuthenticationResponse;
import com.learn.jerseys.repo.UserRepository;
import com.learn.jerseys.service.UserService;

import jakarta.persistence.EntityNotFoundException;

@RestController
@CrossOrigin("*")
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/admin/authenticate")
	public ResponseEntity<Object> authenticateAdmin(@RequestBody AuthenticationRequest request){
		try {
		boolean authenticated = userService.authenticate(request,"admin");
		AuthenticationResponse authenticationResponse;
		if(authenticated) {
			authenticationResponse = new AuthenticationResponse("Success!");
			return ResponseEntity.status(HttpStatus.OK).body(authenticationResponse);
		}
		else {
			authenticationResponse = new AuthenticationResponse("Bad Credentials!");
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(authenticationResponse);
		}
		}
		catch (EntityNotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("User not found");
		}
	}
	
	@PostMapping("/employee/authenticate")
	public ResponseEntity<Object> authenticateEmployee(@RequestBody AuthenticationRequest request){
		AuthenticationResponse authenticationResponse;
		try {
		boolean authenticated = userService.authenticate(request,"employee");
		
		if(authenticated) {
			authenticationResponse = new AuthenticationResponse("Success!");
			return ResponseEntity.status(HttpStatus.OK).body(authenticationResponse);
		}
		else {
			authenticationResponse = new AuthenticationResponse("Bad Credentials!");
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(authenticationResponse);
		}
		}
		catch (EntityNotFoundException e) {
			authenticationResponse = new AuthenticationResponse("User not found");
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body(authenticationResponse);
		}
	}
	
	@GetMapping("/user")
	public ResponseEntity<Object> getAllUsers(){
		
		try {
			return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUsers());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad request!");
		}
	}
	
}
