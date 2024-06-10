package com.sqli.gestionDocument.service;

import com.sqli.gestionDocument.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto userDto);

    UserDto getUserById(Long id);
    List<UserDto> getAllUsers();
}
