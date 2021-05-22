package com.lms.squad4.repositry;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

	public boolean validateUser(User user);
	
	public List<UserBooks> getBooksForAdmin(String userId);
		
}
