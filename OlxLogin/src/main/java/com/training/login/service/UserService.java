package com.training.login.service;



import org.springframework.security.core.userdetails.UserDetailsService;

import com.training.login.entities.User;
import com.training.login.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}