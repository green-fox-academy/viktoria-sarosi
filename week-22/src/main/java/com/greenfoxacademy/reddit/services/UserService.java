package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.entities.User;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(User user) {
        return userRepository.save(user);
    }

    public boolean logUserIn(User user) {
        Optional<User> possibleUser = userRepository.findById(user.getId());
        User existingUser = possibleUser.orElse(null);
        assert existingUser != null;
        return existingUser.equals(user);
    }

    public User findUserByUserId(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.orElse(null);
    }
}
