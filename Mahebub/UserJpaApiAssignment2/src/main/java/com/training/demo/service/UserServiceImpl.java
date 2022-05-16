package com.training.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.demo.entities.User;
import com.training.demo.exception.NoUserFoundException;
import com.training.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User addUser(User user) {

		return userRepository.save(user);
	}

	@Override
	public User retrieveUser(Integer userId) throws NoUserFoundException {
		Optional<User> user = userRepository.findById(userId);
		if (user.isPresent()) {
			return user.get();
		} else {
			throw new NoUserFoundException("Unable to get User with userId"+userId);
		}

	}

	@Override
	public String deleteUser(Integer userId) throws NoUserFoundException {
		if(userId != null) {
			userRepository.deleteById(userId);
			return "User with userId ---" + userId + "  deleted successfully";
		}
		else {
			throw new NoUserFoundException("Unable to detele User with userId"+userId);
		}
	}

	@Override
	public String updateUser(User user) throws NoUserFoundException {
		Optional<User> usr = userRepository.findById(user.getUserId());
		if (usr.isPresent()) {
			User u = userRepository.save(user);
			if (u != null) {
				return "User entity updated successfully";
			} else {
				return "User entity not updated successfully";
			}
		} else {
			throw new NoUserFoundException("User with userId ---" + user.getUserId() + "  cannot be update as it doesn't exists");
		}

	}

	@Override
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}

}