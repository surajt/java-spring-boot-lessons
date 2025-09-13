package com.lessons.repository;

import com.lessons.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public User userSave(User user)
    {
        if (!users.contains(user))
        {
            users.add(user);
        }
        return user;
    }

    public List<User> findAll()
    {
        return users;
    }

    public List<User> findById(int userId)
    {
        return users
                .stream()
                .filter(u -> u.getUserID() == userId)
                .toList();
    }

    public List<User> findByAdmin()
    {
        return users
                .stream()
                .filter(u -> u.getAdmin() == true)
                .toList();
    }

}
