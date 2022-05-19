package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Users;
import com.example.demo.service.Userserviceimp;

@RestController
@RequestMapping(value="/api/v5/user")
public class Usercontroller {
@Autowired 
Userserviceimp userserviceimp;



@PostMapping("/user")
public Users addUser(@RequestBody Users users) {
	return userserviceimp.addUser(users);
}

@GetMapping("/user")
public List<Users> allusers() {
	List<Users> users = userserviceimp.allusers();
	
	return users;
}
}