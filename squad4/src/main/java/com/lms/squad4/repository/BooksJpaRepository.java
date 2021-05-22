package com.lms.squad4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.squad4.entity.Books;

public interface BooksJpaRepository extends JpaRepository<Books, Long>  {

}
