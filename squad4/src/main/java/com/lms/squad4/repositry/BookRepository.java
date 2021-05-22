package com.lms.squad4.repositry;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

	public List<Book> SearchBooks(String bookId,String title,String category);
	
	public String borrowBooks(List<Book> booklist);
	
	public String returnBooks(List<Book> booklist);
	
	public List<Book> getBookHistory(String month,String Year);
	
	public List<UserBooks> getBookForAdmin(String booktitle);
}
