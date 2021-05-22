package com.lms.squad4.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.squad4.entity.Books;
import com.lms.squad4.entity.Users;

@Transactional
@Repository("UsersJpaRepository")
public interface UsersJpaRepository extends JpaRepository<Users, Long>  {

	List<Books> findBooksByUserId(Integer userId);

}
