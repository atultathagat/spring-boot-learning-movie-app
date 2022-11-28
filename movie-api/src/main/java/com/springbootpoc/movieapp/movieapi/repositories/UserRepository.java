package com.springbootpoc.movieapp.movieapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootpoc.movieapp.movieapi.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	List<User> findByEmailAndPassword(String email, String password);

}
