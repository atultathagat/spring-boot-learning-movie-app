package com.springbootpoc.movieapp.movieapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootpoc.movieapp.movieapi.entities.SearchHistory;

public interface SearchHistoryRepository extends JpaRepository<SearchHistory, Integer>{

}
