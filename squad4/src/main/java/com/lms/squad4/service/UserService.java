package com.lms.squad4.service;

import java.util.List;

import com.lms.squad4.entity.Books;
import com.lms.squad4.entity.requests.LoginRequest;

public interface UserService {
	
	
	String login(LoginRequest loginRequest); 
	List<Books> findBooksByUserId(Integer userId);
}
