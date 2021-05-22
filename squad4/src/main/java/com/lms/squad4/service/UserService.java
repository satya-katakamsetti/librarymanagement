package com.lms.squad4.service;

import java.util.List;

import com.lms.squad4.entity.Books;

public interface UserService {

	String login(Integer userId,String password); 
	List<Books> findBooksByUserId(Integer userId);
}
