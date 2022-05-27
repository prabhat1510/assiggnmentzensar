package com.project.olxrestapiprojectuser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.olxrestapiprojectuser.service.UserService;

import olxuserrestapiprojectuser.entities.Users;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	public Users addUser(@RequestBody Users users) {
		return userService.addUser(users);
	}
	
	@GetMapping("/user")
	public List<Users> allusers() {
		List<Users> users = userService.allusers();
		
		return users;
	}
}
