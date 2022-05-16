package com.training.user.service;

import java.util.List;

import com.training.user.entity.User;

public interface UserService {

	// Create
	public User addUSer(User user);

	// Retrieve By id
	public User getUserById(Integer userId);

	// Retrieve By name
	public User getUserByName(String name);

	// Delete
	public String deleteUser(Integer userId);

	// Update
	public String updateUser(User user);

	// Retrieve all users
	public List<User> getAllUsers();

}
