package ru.odybo.pp311.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;


import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class ApiUsersController {
	
	@GetMapping("/")
	public String getUserList() {
		return "users";
	}
	
	@GetMapping("/{id}")
	public String getUserById() {
		return "users";
	}
	
	@PostMapping("/create")
	public String createUser() {
		return "users";
	}

	@PutMapping("/update/{id}")
	public String updateUser() {
		return "users";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser() {
		return "users";
	}
	
}
