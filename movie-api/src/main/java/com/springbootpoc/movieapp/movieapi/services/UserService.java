package com.springbootpoc.movieapp.movieapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootpoc.movieapp.movieapi.entities.User;
import com.springbootpoc.movieapp.movieapi.repositories.UserRepository;

@Service
public class UserService {
	
 @Autowired
 private UserRepository userRepository;
 
 public User saveUser(User user) {
	 return userRepository.save(user);	 
 }
 
 public List<User> getUserByEmailAndPassword (String email, String passoword) {
	return userRepository.findByEmailAndPassword(email, passoword);
 }
 
}
