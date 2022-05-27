package com.olx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

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


