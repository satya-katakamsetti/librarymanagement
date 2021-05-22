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
	@Column(name="tId",nullable=false, updatable=false)
	private long tId;

	@OneToOne
	@JoinColumn(name = "user_id")
	private Users userId;
	
	@OneToOne
	@JoinColumn(name = "book_id")
	private Books bookId;
	
	@Column(name="borrowed_date",nullable=false)
	private Date borrowedDate;

	@Column(name="overdue_charge",nullable=false,length=20)
	private String overdueCharge;
		

	@Column(name="due_date")
	private Date dueDate;

	
	
}
