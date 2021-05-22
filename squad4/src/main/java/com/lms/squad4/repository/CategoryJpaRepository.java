package com.lms.squad4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.squad4.entity.Category;

public interface CategoryJpaRepository extends JpaRepository<Category, Long>  {

}
