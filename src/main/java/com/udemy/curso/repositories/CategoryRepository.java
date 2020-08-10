package com.udemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
	
}
