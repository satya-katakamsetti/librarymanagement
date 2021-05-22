package com.lms.squad4.response;

import java.time.LocalDate;
import java.util.List;

public class UserHistory {
	private int userId;
	private String userName;
	private List<BooksBorrowed> booksBorrowed;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<BooksBorrowed> getBooksBorrowed() {
		return booksBorrowed;
	}

	public void setBooksBorrowed(List<BooksBorrowed> booksBorrowed) {
		this.booksBorrowed = booksBorrowed;
	}

	public static class BooksBorrowed {
		private int bookId;
		private String author;
		private LocalDate date;
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public LocalDate getDate() {
			return date;
		}
		public void setDate(LocalDate date) {
			this.date = date;
		}
		
		
	}
}
