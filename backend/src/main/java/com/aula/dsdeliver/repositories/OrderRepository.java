package com.aula.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
