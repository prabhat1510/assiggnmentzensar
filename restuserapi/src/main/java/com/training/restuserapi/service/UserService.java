package com.training.restuserapi.service;

import java.util.List;

import com.training.restuserapi.entities.User;
import com.training.restuserapi.exception.NoUserFoundException;
import com.training.restuserapi.exception.UserNotUpdated;

public interface UserService {
	public User addUser(User user);
	
	public User retriveUser(Integer userId) throws NoUserFoundException;
	
	public String deleteUser(Integer userId);
	
	public String updateUser(User user) throws UserNotUpdated;
	
	public List<User> getAllUsers();
	

}
