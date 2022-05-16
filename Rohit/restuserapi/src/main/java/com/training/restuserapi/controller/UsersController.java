package com.training.restuserapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.restuserapi.entities.User;
import com.training.restuserapi.service.UserService;

@RestController
@RequestMapping(value = "/api/v2/user")
public class UsersController {
	@Autowired
	UserService service;
	
	//http://localhost:9090/api/v2/user/allusers
	@RequestMapping(value="/api/v2/user/allusers",
			method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_XML_VALUE})
	public List<User> getUsers(){
		return service.getAllUsers();
	}
}
