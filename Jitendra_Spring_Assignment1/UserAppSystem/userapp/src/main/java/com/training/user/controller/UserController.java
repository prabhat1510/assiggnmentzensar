package com.training.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.user.entity.User;
import com.training.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userservice;
	
	// Create
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user)
	{
		return userservice.addUSer(user);
	}
	
	// Retrieve
	@GetMapping("/{id}")
	public User getUser(@PathVariable Integer userid)
	{
		return userservice.getUserById(userid);
	}
	
	// Update
	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User user)
	{
		return null;
	}
	
	// Delete
	@DeleteMapping("/deleteuser")
	public String deleteUser(@PathVariable Integer userid)
	{
		return null;
	}
	
}
