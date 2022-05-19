package com.training.olxlogin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.olxlogin.entities.Users;
import com.training.olxlogin.exception.NoUserFoundException;
import com.training.olxlogin.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public Users addUser(Users users) {
		return userRepository.save(users);
	}
	@Override
	public Users retriveUser(Integer userId) throws NoUserFoundException {
		Optional<Users> users=userRepository.findById(userId);
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
