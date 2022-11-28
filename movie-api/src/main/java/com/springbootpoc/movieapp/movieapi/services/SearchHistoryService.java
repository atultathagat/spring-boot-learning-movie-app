package com.springbootpoc.movieapp.movieapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootpoc.movieapp.movieapi.entities.SearchHistory;
import com.springbootpoc.movieapp.movieapi.repositories.SearchHistoryRepository;

@Service
public class SearchHistoryService {
	
 @Autowired
 private SearchHistoryRepository searchHistoryRepository;
 
 public SearchHistory saveSearchHistory(SearchHistory searchHistory) {
	 return searchHistoryRepository.save(searchHistory);	 
 }
 
 public List<SearchHistory> getSearchHistory() {
	return searchHistoryRepository.findAll();
 }
 
}
