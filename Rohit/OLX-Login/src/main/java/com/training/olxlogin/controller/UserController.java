package com.training.olxlogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.olxlogin.entities.Users;
import com.training.olxlogin.exception.NoUserFoundException;
import com.training.olxlogin.service.UserService;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {
	@Autowired
	UserService service;
	
	//url:http://localhost:9090/api/v1/user/adduser
	@PostMapping("/adduser")
	public Users addUser(@RequestBody Users users)
	{
		return service.addUser(users);
	}
	
	
	//url:http://localhost:9090/api/v1/user/2
	@GetMapping("/{userId}")
	public Users retriveUser(@PathVariable Integer userId) throws NoUserFoundException
	{
		return service.retriveUser(userId);
	}
	
	
	//url:http://localhost:9090/api/v1/user/deleteuser/2
	@DeleteMapping("/deleteuser/{id}")
	public String deleteUser(@PathVariable Integer id)
	{
		return service.deleteUser(id);
	}


}
