package com.udemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
	
}
