package com.springbootpoc.movieapp.movieapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootpoc.movieapp.movieapi.entities.User;
import com.springbootpoc.movieapp.movieapi.services.UserService;
import com.springbootpoc.movieapp.movieapi.entities.SearchHistory;
import com.springbootpoc.movieapp.movieapi.services.SearchHistoryService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MovieController {

	@Autowired
	private UserService userService;
	@Autowired
	private SearchHistoryService searchHistoryService;
	
	@PostMapping("/registerUser")
	public User addUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@PostMapping("/loginUser")
	public List<User> getUser(@RequestBody User user) {
		return userService.getUserByEmailAndPassword(user.getEmail(), user.getPassword());
	}
	
	@PostMapping("/addSearchHistory")
	public SearchHistory addSearchHistory(@RequestBody SearchHistory searchHistory) {
		return searchHistoryService.saveSearchHistory(searchHistory);
	}
	
	@GetMapping("/getSearchHistory")
	public List<SearchHistory> getSearchHistory() {
		return searchHistoryService.getSearchHistory();
	}

	
}
