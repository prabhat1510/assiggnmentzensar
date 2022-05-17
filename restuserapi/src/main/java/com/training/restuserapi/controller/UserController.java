package com.training.restuserapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.restuserapi.entities.User;
import com.training.restuserapi.exception.NoUserFoundException;
import com.training.restuserapi.exception.UserNotUpdated;
import com.training.restuserapi.service.UserService;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	//url:http://localhost:9090/api/v1/user/adduser
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user)
	{
		return service.addUser(user);
	}
	
	
	//url:http://localhost:9090/api/v1/user/2
	@GetMapping("/{userId}")
	public User retriveUser(@PathVariable Integer userId) throws NoUserFoundException
	{
		return service.retriveUser(userId);
	}
	
	
	//url:http://localhost:9090/api/v1/user/deleteuser/2
	@DeleteMapping("/deleteuser/{userId}")
	public String deleteUser(@PathVariable Integer userId)
	{
		return service.deleteUser(userId);
	}
	//url:http://localhost:9090/api/v1/user/updateuser
	@PutMapping("/updateuser")
	public String updateUser(@RequestBody User user) throws UserNotUpdated
	{
		return service.updateUser(user);
		
	}

}
