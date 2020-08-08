package com.udemy.curso.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.curso.entities.User;
import com.udemy.curso.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	public User findById(Long id){
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
