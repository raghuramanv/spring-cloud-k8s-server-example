package io.azu.k8s.server.controller;

import java.time.Instant;
import java.time.ZoneOffset;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@GetMapping
	public String getUsers() {
		Instant current = Instant.now();
		return "Shyamala, Katarina, Charumati, Drew, Nathan, ".concat(current.atOffset(ZoneOffset.ofHours(5)).toString());
	}

}
