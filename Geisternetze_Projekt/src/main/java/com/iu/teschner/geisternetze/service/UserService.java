package com.iu.teschner.geisternetze.service;

import com.iu.teschner.geisternetze.model.User;
import com.iu.teschner.geisternetze.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;



    public User registerUser(String username, String password, String schiffname,String telnummer) {
        if (userRepository.findByUsername(username) == null) {
            User user = new User(password, username, schiffname,telnummer);
            return userRepository.save(user);
        }
        return null;
    }

    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}