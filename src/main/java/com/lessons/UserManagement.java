package com.lessons;

import com.lessons.model.User;
import com.lessons.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserManagement {
    private final UserRepository userRepository;

    public UserManagement(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.createSampleUserData();
    }

    public void createUser(int userID, String firstName, String lastName, String email, String mobile, Boolean isAdmin)
    {
        this.userRepository.userSave(new User(userID, firstName, lastName, email, mobile, isAdmin));
    }

    public void createSampleUserData()
    {
        createUser(1, "John", "Smith", "john@sample.com", "231-234-4543", false);
        createUser(1, "James", "Will", "james@sample.com", "322-234-4543", false);
        createUser(1, "Apple", "Trick", "apple@sample.com", "343-234-4543", true);
    }
}
