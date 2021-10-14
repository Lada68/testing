package com.example.testing.converter;

import com.example.testing.model.dto.RoleDto;
import com.example.testing.model.entity.Role;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface RoleMapper {
    RoleDto toDto(Role role);
    Role toModel(RoleDto roleDto);
}
