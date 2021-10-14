package com.example.testing.webapp.rest_controller;

import com.example.testing.converter.UserMapper;
import com.example.testing.model.dto.UserDto;
import com.example.testing.model.entity.User;
import com.example.testing.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestController {
private final UserService userService;
private final UserMapper mapper;

    public UserRestController(UserService userService, UserMapper mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }

    @PostMapping("/register")
    public boolean register (@RequestBody UserDto userDto) {
        User user = mapper.toModel(userDto);
      return userService.registerNewUser(user);
    }
}
