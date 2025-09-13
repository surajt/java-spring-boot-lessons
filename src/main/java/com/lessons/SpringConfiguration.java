package com.lessons;

import com.lessons.repository.UserRepository;
import com.lessons.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public UserRepository userRepository()
    {
        return new UserRepository();
    }

    @Bean
    public UserService userService()
    {
        return new UserService(userRepository());
    }

    @Bean
    public UserManagement userManagement()
    {
        return new UserManagement(userRepository());
    }
}
