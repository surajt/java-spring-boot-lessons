package com.lessons;

import com.lessons.repository.UserRepository;
import com.lessons.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        UserManagement userManagement = new UserManagement(userRepository);
        userManagement.createSampleUserData();

        System.out.println("Show User Details");
        userService.showAllUsers();
        System.out.println("Show only admin users.");
        userService.showAllAdminUsers();
    }
}