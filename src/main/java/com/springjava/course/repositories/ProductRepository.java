package com.springjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjava.course.entities.Category;
import com.springjava.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
