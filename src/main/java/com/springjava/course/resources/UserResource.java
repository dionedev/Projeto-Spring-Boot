package com.springjava.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springjava.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User user = new User(1L, "Dione", "dionedev@gmail.com", "48999253347", "1234");
		
		return ResponseEntity.ok().body(user);
	}
	
	
}
