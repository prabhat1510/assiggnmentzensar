package com.olx.demo.service;

import java.util.HashSet;
import java.util.Set;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.olx.demo.entities.Role;
import com.olx.demo.entities.Users;
import com.olx.demo.exception.NoUsersFoundException;
import com.olx.demo.repository.RoleRepository;
import com.olx.demo.repository.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	UsersRepository usersRepository;
	
    @Autowired
    private RoleRepository roleRepository;
    
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(Users user) {
    	Set<Role> hash_Set = new HashSet<Role>();
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        usersRepository.save(user);
    }

    @Override
    public Users findByUsername(String username) {
        return usersRepository.findByUsername(username);
    }

	@Override
	public Users addUser(Users users) {

		return usersRepository.save(users);
	}

	@Override
	public Users retrieveUser(Integer id) throws NoUsersFoundException {
		Optional<Users> user = usersRepository.findById(id);
		if (user.isPresent()) {
			return user.get();
		} else {
			throw new NoUsersFoundException("Unable to get User with userId"+id);
		}
	}
	
}