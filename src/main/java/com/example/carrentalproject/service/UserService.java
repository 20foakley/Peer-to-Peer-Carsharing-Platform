package com.example.carrentalproject.service;

import com.example.carrentalproject.model.User;
import com.example.carrentalproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public Optional<User> getUserById(Long id) {

        return userRepository.findById(id);
    }

    public User getUserByEmail(String email) {

        return userRepository.findByEmail(email);
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username); }

    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    public void deleteUser(Long id) {

        userRepository.deleteById(id);
    }

    public User registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}