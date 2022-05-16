package com.training.resetapiexample.service;

import java.util.List;

import com.training.resetapiexample.entity.User;
import com.training.resetapiexample.exception.NoUserFoundException;
import com.training.resetapiexample.exception.UserNotUpdated;

public interface UserService {


		//Create
		public User addUser(User user);
		//Retrieve
		public User retrieveUser(Integer userId) throws NoUserFoundException;
		//Delete
		public String deleteUser(Integer userId);
		
		//Update
		public String updateUser(User user) throws UserNotUpdated;
		
		//Retrieve all books
		public List<User> getAllUsers();
	}