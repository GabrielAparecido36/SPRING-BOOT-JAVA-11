package com.udemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	
	
}
