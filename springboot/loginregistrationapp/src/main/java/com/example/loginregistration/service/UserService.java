package com.example.loginregistration.service;

import com.example.loginregistration.model.User;
import com.example.loginregistration.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
