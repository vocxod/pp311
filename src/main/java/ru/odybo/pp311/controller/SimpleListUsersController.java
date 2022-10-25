package ru.odybo.pp311.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleListUsersController {
	
	@GetMapping("/simple/list")
	public String home() {
		return "simplelist";
	}

}
