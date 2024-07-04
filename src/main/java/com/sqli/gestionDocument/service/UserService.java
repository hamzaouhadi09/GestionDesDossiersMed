package com.sqli.gestionDocument.service;

import com.sqli.gestionDocument.dto.UserDto;
import com.sqli.gestionDocument.module.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    User getUserById(Long id);

    User updateUser(Long id, User userDetails);

    void deleteUser(Long id);

    List<User> getAllUsers();
}
