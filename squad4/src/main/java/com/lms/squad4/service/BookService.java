package com.lms.squad4.service;

import java.awt.print.Book;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface BookService {

	List<Book> findBooksByBookIdOrTitleOrCategoryId(Integer bookId,String title,Integer categoryId);
	void borrowBooks(Integer bookId,Integer userId);
	void returnBooks(Integer bookId,Integer userId);
	

}
