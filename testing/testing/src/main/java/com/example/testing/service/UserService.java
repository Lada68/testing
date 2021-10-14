package com.example.testing.service;

import com.example.testing.model.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    boolean registerNewUser(User user);
}
