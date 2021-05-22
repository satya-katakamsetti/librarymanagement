package com.lms.squad4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.squad4.entity.Role;

public interface RoleJpaRepository extends JpaRepository<Role, Long>  {

}
