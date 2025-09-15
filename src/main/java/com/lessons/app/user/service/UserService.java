package com.lessons.app.user.service;

import com.lessons.app.user.model.User;
import com.lessons.app.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> finalAll()
    {
        return userRepository.findAll();
    }

    public Optional<User> findById(int userId)
    {
        return userRepository.findById(userId);
    }

    public User save(User user)
    {
        return userRepository.save(user);
    }

    public void deleteById (int userId){
        userRepository.deleteById(userId);
    }

    public User updateUser(Long userId, User user)
    {
        user.setUserId(userId);
        return userRepository.save(user);
    }
}
