package com.lms.squad4.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "users_books")
@Data
public class UsersBooks {

	@Id
	@Column(name = "TId", nullable = false, updatable = false)
	private long tId;

	@OneToOne
	@JoinColumn(name = "UserId")
	private Users userId;

	@OneToOne
	@JoinColumn(name = "BookId")
	private Books bookId;

	@Column(name = "BorrowDate", nullable = false)
	private Date borrowedDate;

	@Column(name = "OverdueCharges", nullable = false, length = 20)
	private String overdueCharge;

	@Column(name = "DueDate")
	private Date dueDate;

	public long gettId() {
		return tId;
	}

	public void settId(long tId) {
		this.tId = tId;
	}

	public Users getUserId() {
		return userId;
	}

	public void setUserId(Users userId) {
		this.userId = userId;
	}

	public Books getBookId() {
		return bookId;
	}

	public void setBookId(Books bookId) {
		this.bookId = bookId;
	}

	public Date getBorrowedDate() {
		return borrowedDate;
	}

	public void setBorrowedDate(Date borrowedDate) {
		this.borrowedDate = borrowedDate;
	}

	public String getOverdueCharge() {
		return overdueCharge;
	}

	public void setOverdueCharge(String overdueCharge) {
		this.overdueCharge = overdueCharge;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "UsersBooks [tId=" + tId + ", userId=" + userId + ", bookId=" + bookId + ", borrowedDate=" + borrowedDate
				+ ", overdueCharge=" + overdueCharge + ", dueDate=" + dueDate + "]";
	}
	
	

}
