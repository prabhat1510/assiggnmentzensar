package com.training.olxlogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.olxlogin.entity.Users;
import com.training.olxlogin.service.UserService;

// URI - http://localhost:9090/
@RestController
public class UserController {

	@Autowired
	UserService userservice;

	// 1. Logins a user
	@PostMapping("/user/authenticate")
	public String loginUser(@RequestParam String username, @RequestParam String password) // POST
	{
		return userservice.loginUser(username, password);
	}

	// 2. Logs out a user

	public boolean logoutUser(Integer id) { // DELETE
		return false;
	}

	// 3. Registers an user
	@PostMapping("/user")
	public Users registerUser(@RequestBody Users user) {
		return userservice.registerUser(user);
	}

	// 4. Returns user information
	// Actually there is auth-token
	@GetMapping("/user/{id}")
	public Users getUser(@PathVariable Integer id) // GET
	{
		return userservice.getUser(id);
	}
}
