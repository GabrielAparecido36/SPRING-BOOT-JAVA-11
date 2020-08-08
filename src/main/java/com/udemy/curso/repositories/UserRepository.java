package com.udemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
}
