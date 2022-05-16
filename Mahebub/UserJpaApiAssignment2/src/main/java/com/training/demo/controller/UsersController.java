package com.training.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.demo.entities.User;
import com.training.demo.exception.NoUserFoundException;
import com.training.demo.service.UserService;

@RestController
public class UsersController {
	@Autowired
	UserService userService;
	
	//Retrieving data from client
	
	@RequestMapping(value="/api/v2/user/allusers",
			method = RequestMethod.GET,
			//consumes = {MediaType.APPLICATION_XML_VALUE},
			produces = {MediaType.APPLICATION_XML_VALUE})
	public List<User> getUsers() {
		return userService.getAllUsers();
	}
}
