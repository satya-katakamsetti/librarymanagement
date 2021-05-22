package com.lms.squad4.serviceImpl;

import java.awt.print.Book;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lms.squad4.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Override
	public List<Book> findBooksByBookIdOrTitleOrCategoryId(Integer bookId, String title, Integer categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrowBooks(Integer bookId, Integer userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void returnBooks(Integer bookId, Integer userId) {
		// TODO Auto-generated method stub
		
	}

}
