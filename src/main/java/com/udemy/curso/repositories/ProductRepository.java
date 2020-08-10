package com.udemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
	
}
