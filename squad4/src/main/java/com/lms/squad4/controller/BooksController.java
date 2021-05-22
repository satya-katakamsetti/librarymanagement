package com.lms.squad4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lms.squad4.entity.Books;
import com.lms.squad4.entity.pojo.RequestType;
import com.lms.squad4.entity.requests.BorrowReturn;
import com.lms.squad4.response.BorrowHistory;

@RestController
@RequestMapping("/books")
public class BooksController {
	
	@GetMapping
	public List<Books> getBooks(@RequestParam int bookId, @RequestParam String title, @RequestParam String author, @RequestParam String category){
		List<Books> books=new ArrayList<>();
		
		
		return books;
	}
	
	@PostMapping("/borrow/{bookId}/requests")
	public String borrow(@PathVariable String bookId, @RequestBody BorrowReturn borrow) {
		
		if(RequestType.BORROW.equals(borrow.getRequestType())) {
			
		}else if (RequestType.RETURN.equals(borrow.getRequestType())) {
			
		}
		
		return "";
	}
	
	@GetMapping("/history")
	public List<BorrowHistory> getBorrowHistory(@RequestParam int userId){
		return new ArrayList<>();
	}
}
