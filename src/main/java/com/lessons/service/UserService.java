package com.lessons.service;

import com.lessons.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void showAllUsers()
    {
        userRepository.findAll()
                .forEach(System.out::println);
    }

    public void showAllAdminUsers()
    {
        userRepository.findAll()
                .stream()
                .filter(u -> u.getAdmin() == true)
                .forEach(System.out::println);
    }

    public void showUserById(int userId)
    {
        this.userRepository.findById(userId)
                .forEach(System.out::println);
    }
}
