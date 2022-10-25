package ru.odybo.pp311.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {
	
	@GetMapping("/list/users")
	public String home() {
		return "users";
	}

}
