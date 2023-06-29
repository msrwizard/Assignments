package com.usermanagement.usermanagementsystem.service;

import com.usermanagement.usermanagementsystem.entity.UserEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import com.usermanagement.usermanagementsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public UserEntity getUserById(Long userId) {
        return userRepository.getUserById(userId);
    }

    public UserEntity addUser(UserEntity user) {
        return userRepository.addUser(user);
    }

    public UserEntity updateUser(Long userId, UserEntity updatedUser) {
        return userRepository.updateUser(userId, updatedUser);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteUser(userId);
    }
}
