package com.bravetech.doordrop.controllers;

import com.bravetech.doordrop.repositories.UserDetailsRepository;
import com.bravetech.doordrop.User.UserRegistrationData;
import com.bravetech.doordrop.repositories.UserRepository;
import com.bravetech.doordrop.models.User;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserRepository userRepository;
    private final UserDetailsRepository userDetailsRepository;

    public UserController(UserRepository userRepository, UserDetailsRepository userDetailsRepository) {
        this.userRepository = userRepository;
        this.userDetailsRepository = userDetailsRepository;
    }

    @PostMapping("/user/login")
    public ResponseEntity<?> logIng(@RequestBody User user) {
        try {
           User authUser = userRepository.findAllByUsernameAndPassword(user.getUsername(), user.getPassword());

           if(authUser != null)
            return ResponseEntity.status(HttpStatus.OK).body("Login");
           else
            return ResponseEntity.status(HttpStatus.OK).body("Wrong password or email");
        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Login Error");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Wrong password or email");
        }
    }

    @PostMapping("/user/register")
    public ResponseEntity<?> register(@RequestBody UserRegistrationData userData) {
        try {
            User newUser = userRepository.save(userData.getUserCredentials());
            userDetailsRepository.save(userData.getUserDetails(newUser.getId()));

            return ResponseEntity.status(HttpStatus.OK).body("Registration successful");
        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Email or phone number you provide Already Exist");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Server error: Unable to register user");
        }
    }
}
