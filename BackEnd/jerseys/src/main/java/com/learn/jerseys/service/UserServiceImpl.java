package com.learn.jerseys.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.learn.jerseys.custom.AuthenticationRequest;
import com.learn.jerseys.model.User;
import com.learn.jerseys.repo.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User User) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = userRepository.findAll();
		return users;
	}

	@Override
	public User getUserById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.orElseThrow(()->{return new EntityNotFoundException("User with "+id+" does not exist");});
	}
	


	@Override
	public User updateUser(User User) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean authenticate(AuthenticationRequest request, String string) {
		String username, password;
		username = request.getUsername();
		password = request.getPassword();
		try {
			Optional<User> user = userRepository.findByUsername(username);
			if(user.isEmpty()) {
				return false;
			}
			if(username.contentEquals(user.get().getUsername()) && password.contentEquals(user.get().getPassword()) && string.contentEquals(user.get().getUserlevel())) {
				return true;
			}
		}
		catch (EntityNotFoundException e) {
			throw e;
		}
		return false;
	}
	
	
}
