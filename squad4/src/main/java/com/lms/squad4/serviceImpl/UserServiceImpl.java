package com.lms.squad4.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.squad4.entity.Books;
import com.lms.squad4.entity.requests.LoginRequest;
import com.lms.squad4.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserService userService;

	@Override
	public String login(LoginRequest loginRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Books> findBooksByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
