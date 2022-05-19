package com.training.olxusers.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.olxusers.entity.Users;
import com.training.olxusers.exception.NoUserFoundException;
import com.training.olxusers.repository.UserRepository;
@Service

public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	@Override
	public Users addUser(Users users	) {
		// TODO Auto-generated method stub
		return userRepository.save(users);
	}	

	@Override
	public Users retriveUser(Integer id) throws NoUserFoundException {
		Optional<Users> users=userRepository.findById(id);
		if(users.isPresent())
		{
			return users.get();
		}
		else {
			throw new NoUserFoundException();
		}
	}
	

	@Override
	public String deleteUser(Integer id) {
		userRepository.deleteById(id);
		return "User with Id"+id+"is deleted Sucessfully";
	}
	

	@Override
	public List<Users> getAllUsers() {
		return (List<Users>) userRepository.findAll();
	}

}
