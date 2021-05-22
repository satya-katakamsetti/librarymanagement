package com.lms.squad4.service;

import com.lms.squad4.entity.Users;

public interface UserService {

	String login(Integer userId,String password); 
	Users findBookDetailByBookId(Integer bookId);
}
