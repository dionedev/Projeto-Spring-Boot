package com.springjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjava.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
