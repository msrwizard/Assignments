package com.usermanagement.usermanagementsystem.controller;

import com.usermanagement.usermanagementsystem.entity.UserEntity;
import org.springframework.web.bind.annotation.*;
import com.usermanagement.usermanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;


@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAllUser")
    public List<UserEntity> getAllUser() {
        return userService.getAllUsers();
    }

    @GetMapping("/getUser/{userId}")
    public UserEntity getUser(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody UserEntity user) {
        userService.addUser(user);
        return "User Added";
    }

    @PutMapping("/updateUserInfo/{userId}")
    public String updateUserInfo(@PathVariable Long userId, @RequestBody UserEntity user) {
        userService.updateUser(userId, user);
        return "User Updated for user id :" + userId;
    }

    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
        return "User Deleted for user id :" + userId;
    }
}

