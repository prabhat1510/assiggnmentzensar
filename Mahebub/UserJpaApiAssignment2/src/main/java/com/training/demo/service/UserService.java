package com.training.demo.service;

import java.util.List;

import com.training.demo.entities.User;
import com.training.demo.exception.NoUserFoundException;

public interface UserService {
	//Create
	public User addUser(User user);
	//Retrieve
	public User retrieveUser(Integer userId) throws NoUserFoundException;
	//Delete
	public String deleteUser(Integer userId) throws NoUserFoundException;
	
	//Update
	public String updateUser(User user) throws NoUserFoundException;
	
	//get all user
	public List<User> getAllUsers();
}