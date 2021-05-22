package com.lms.squad4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lms.squad4.entity.Books;
import com.lms.squad4.entity.requests.LoginRequest;
import com.lms.squad4.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/login")
	public void login(@RequestBody LoginRequest login) {

	}

	@GetMapping("/history")
	public List<Books> history(@RequestParam int userId) {
		
		return userService.findBooksByUserId(userId);
		
	}
}
