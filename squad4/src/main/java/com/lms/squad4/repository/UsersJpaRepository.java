package com.lms.squad4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.squad4.entity.Users;

public interface UsersJpaRepository extends JpaRepository<Users, Long>  {

}
