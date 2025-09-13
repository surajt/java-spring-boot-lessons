package com.lessons;

import com.lessons.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class.getPackageName());
        UserService  userService = applicationContext.getBean(UserService.class);

        System.out.println("Show User Details");
        userService.showAllUsers();
        System.out.println("Show only admin users.");
        userService.showAllAdminUsers();
    }
}