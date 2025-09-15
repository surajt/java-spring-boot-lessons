package com.lessons.app.user.controller;

import com.lessons.app.user.model.User;
import com.lessons.app.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> listAllUsers()
    {
        return userService.finalAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public User createUser(@RequestBody User user)
    {
        log.info("Creating new user {}", user);
        return userService.save(user);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable int userId)
    {
        log.info("Delete user id {}", userId);
        userService.deleteById(userId);
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable Long userId, @RequestBody User user)
    {
        log.info("Update user id {} with user {}", userId, user);
       return userService.updateUser(userId, user);
    }
}
