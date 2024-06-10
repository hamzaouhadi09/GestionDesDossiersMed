package com.sqli.gestionDocument.service;

import com.sqli.gestionDocument.dto.UserDto;
import com.sqli.gestionDocument.module.Role;
import com.sqli.gestionDocument.module.RoleType;
import com.sqli.gestionDocument.module.User;
import com.sqli.gestionDocument.repository.RoleRepository;
import com.sqli.gestionDocument.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;
    @Override
    public UserDto saveUser(UserDto userDto) {
        User user = convertToEntity(userDto);
        User savedUser = userRepository.save(user);
        return convertToDTO(savedUser);
    }


    @Override
    public UserDto getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found: " + id));
        return convertToDTO(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }


    private UserDto convertToDTO(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        userDto.setPassword(user.getPassword());
        if (user.getRole() != null) {
            userDto.setRole(user.getRole().getName().name());
        }
        return userDto;
    }

    private User convertToEntity(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        if (userDto.getRole() != null) {
            Role role = roleRepository.findByName(RoleType.valueOf(userDto.getRole()))
                    .orElseThrow(() -> new RuntimeException("Role not found: " + userDto.getRole()));
            user.setRole(role);
        }
        return user;
    }
}
