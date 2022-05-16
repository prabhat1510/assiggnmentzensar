package com.training.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.demo.entities.User;
import com.training.demo.exception.NoUserFoundException;
import com.training.demo.service.UserService;

@RestController
@RequestMapping(value="/api/v1/user")
public class UserController {

	@Autowired
	UserService userService;
	
	//Create
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	//Retrieve
	@GetMapping("/{userId}")
	public User retrieveUser(@PathVariable Integer userId) throws NoUserFoundException {
		
		return userService.retrieveUser(userId);
	}
	//Delete
	@DeleteMapping("/removeuser/{userId}")
	public String deleteUser(@PathVariable Integer userId) throws NoUserFoundException {
		
		return userService.deleteUser(userId);
	}
	
	//Update
	@PutMapping("/updateuser")
	public String updateUser(@RequestBody User user) throws NoUserFoundException {
		return userService.updateUser(user);
	}
	
}