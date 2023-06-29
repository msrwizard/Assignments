package com.usermanagement.usermanagementsystem.repository;

import com.usermanagement.usermanagementsystem.entity.UserEntity;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private final List<UserEntity> userList = new ArrayList<>();

    public List<UserEntity> getAllUsers() {
        return userList;
    }

    public UserEntity getUserById(Long userId) {
        for (UserEntity user : userList) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        throw new IllegalStateException("User not found");
    }

    public UserEntity addUser(UserEntity user) {
        userList.add(user);
        return user;
    }

    public UserEntity updateUser(Long userId, UserEntity updatedUser) {
        for (UserEntity user : userList) {
            if (user.getUserId().equals(userId)) {
                user.setName(updatedUser.getName());
                user.setUserName(updatedUser.getUserName());
                user.setAddress(updatedUser.getAddress());
                user.setPhoneNumber(updatedUser.getPhoneNumber());
                return user;
            }
        }
        throw new IllegalStateException("User not found");
    }

    public void deleteUser(Long userId) {
        userList.removeIf(user -> user.getUserId().equals(userId));
    }
}
