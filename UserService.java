package com.himanshu.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.himanshu.springboot.model.User;
import com.himanshu.springboot.web.DTO.UserRegistrationDTO;

@Service
public interface UserService extends UserDetailsService {
	User save(UserRegistrationDTO registrationDTO);

}
