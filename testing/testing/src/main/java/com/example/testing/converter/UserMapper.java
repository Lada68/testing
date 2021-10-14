package com.example.testing.converter;

import com.example.testing.model.dto.UserDto;
import com.example.testing.model.entity.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")

public interface UserMapper {
    UserDto toDto(User user);
    User toModel(UserDto userDto);
}
