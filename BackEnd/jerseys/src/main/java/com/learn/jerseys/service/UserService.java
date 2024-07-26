package com.learn.jerseys.service;

import java.util.List;

import com.learn.jerseys.custom.AuthenticationRequest;
import com.learn.jerseys.model.User;

public interface UserService {

	User saveUser(User User);
    List<User> getAllUsers();
    User getUserById(Long id);
    User updateUser(User User);
    void deleteUser(Long id);
	boolean authenticate(AuthenticationRequest request, String string);
}
