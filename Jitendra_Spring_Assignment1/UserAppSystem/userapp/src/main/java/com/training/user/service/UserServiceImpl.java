package com.training.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.user.entity.User;
import com.training.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userrepo;

	// 1. For Adding The user into the datatbae
	@Override
	public User addUSer(User user) {
		return userrepo.save(user);
	}

	// 2. Get user by using user id
	@Override
	public User getUserById(Integer userId) {
		Optional<User> user = userrepo.findById(userId);
		if (user.isPresent()) {
			return user.get();
		} else {
			return null;
		}
	}

	// 3. Get user by using user name
	@Override
	public User getUserByName(String name) {

		return null;
	}

	// 4. For deleting the user from database by using User Id
	@Override
	public String deleteUser(Integer userId) {
		Optional<User> user = userrepo.findById(userId);
		if (user.isPresent()) {
			userrepo.deleteById(userId);
			return "User with Id = " + userId + " is Deleted";
		} else {
			return "User with Id = " + userId + " is Not Present";
		}
	}

	// 5. For Updating the existing user
	@Override
	public String updateUser(User user) {
		Optional<User> use = userrepo.findById(user.getId());
		if (use.isPresent()) {
			User msg = userrepo.save(user);
			if (msg != null) {
				return "User data updated successfully";
			} else {
				return "User data not updated successfully";
			}
		} else {
			return "User with userId ---" + user.getId() + " doesn't exists";
		}
	}

	// 6. For getting all the users from the list
	@Override
	public List<User> getAllUsers() {
		return (List<User>) userrepo.findAll();
	}

}
