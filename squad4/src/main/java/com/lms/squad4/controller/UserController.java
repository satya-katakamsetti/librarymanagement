package com.lms.squad4.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.squad4.entity.requests.LoginRequest;

@RestController
@RequestMapping("/users")
public class UserController {

	@PostMapping("/login")
	public void login(@RequestBody LoginRequest login) {
		
	}
}
