package userrestapiexample1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import userrestapiexample1.entities.User;
import userrestapiexample1.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public User addUser(User user) {

		return userRepository.save(user);
	}

	@Override
	public User retrieveUser(Integer userId) {
		Optional<User> user = userRepository.findById(userId);
		if (user.isPresent()) {
			return user.get();
		} else {
			return null;
		}

	}

	@Override
	public String deleteUser(Integer userId) {
		userRepository.deleteById(userId);
		return "User with userId ---" + userId + "  deleted successfully";
	}

	@Override
	public String updateUser(User user) {
		Optional<User> bok = userRepository.findById(user.getUserId());
		if (bok.isPresent()) {
			User bk = userRepository.save(user);
			if (bk != null) {
				return "User entity updated successfully";
			} else {
				return "User entity not updated successfully";
			}
		} else {
			return "User with userId ---" + user.getUserId() + "  cannot be update as it doesn't exists";
		}
	}
		@Override
		public List<User> getAllUsers() {
			
			return (List<User>) userRepository.findAll();
	}

}


