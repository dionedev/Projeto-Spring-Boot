package com.springjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
