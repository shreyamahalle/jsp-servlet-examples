package com.shreya.jspservlet.service;

import com.shreya.jspservlet.model.User;
import com.shreya.jspservlet.repository.UserRepository;

import java.util.List;

public class UserService {

    private UserRepository userRepository = new UserRepository();

    public boolean login(String username, String password) {
        if (username == null || password == null || username.isEmpty() || password.isEmpty())
            return false;

        User user = new User(username, password);
        return userRepository.isValidUser(user);
    }

}

