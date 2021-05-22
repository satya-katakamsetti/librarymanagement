package com.lms.squad4.response;

import java.time.LocalDate;

public class BorrowHistory {
	private int bookId;
    private  String bookName;
    private String author;
    private LocalDate borrowedDate;
    private int overDue;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public LocalDate getBorrowedDate() {
		return borrowedDate;
	}
	public void setBorrowedDate(LocalDate borrowedDate) {
		this.borrowedDate = borrowedDate;
	}
	public int getOverDue() {
		return overDue;
	}
	public void setOverDue(int overDue) {
		this.overDue = overDue;
	}
    
    
    
}
