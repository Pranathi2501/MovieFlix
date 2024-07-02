package com.movieflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieflix.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
//	Method to find user  by using 
	public User findByEmail(String email);

	

	
}
