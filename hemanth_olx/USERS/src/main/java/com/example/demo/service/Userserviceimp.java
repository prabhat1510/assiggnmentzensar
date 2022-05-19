package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Users;
import com.example.demo.repository.Userrepository;

@Service
public class Userserviceimp implements Userservice{
	@Autowired
	Userrepository userrepository;

	@Override
	public Users addUser(Users users) {
		return userrepository.save(users);
	}

	@Override
	public List<Users> allusers() {
		return (List<Users>) userrepository.findAll();
	}

}
