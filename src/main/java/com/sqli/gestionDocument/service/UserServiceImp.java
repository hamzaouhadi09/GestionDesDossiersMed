package com.sqli.gestionDocument.service;

import com.sqli.gestionDocument.dto.UserDto;
import com.sqli.gestionDocument.module.*;
import com.sqli.gestionDocument.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found: " + id));
    }

    @Override
    public User updateUser(Long id, User userDetails) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found: " + id));
        user.setUsername(userDetails.getUsername());
        user.setEmail(userDetails.getEmail());
        user.setPassword(userDetails.getPassword());
        user.setRole(userDetails.getRole());
        if (user instanceof Medecin) {
            ((Medecin) user).setSpecialty(((Medecin) userDetails).getSpecialty());
        } else if (user instanceof Collaborateur) {
            ((Collaborateur) user).setDepartment(((Collaborateur) userDetails).getDepartment());
        } else if (user instanceof ChargeRH) {
            ((ChargeRH) user).setOfficeLocation(((ChargeRH) userDetails).getOfficeLocation());
        }
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found: " + id));
        userRepository.delete(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}