package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.OrderItem;


// não é necessario colocal @repository já que o jparepository que é a classe que está
//herdando já esta registrado
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
