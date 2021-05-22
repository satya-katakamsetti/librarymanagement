package com.lms.squad4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "books")
@Data
public class Books {

	@Id
	@Column(name = "BookId", nullable = false, updatable = false)
	private long bookId;

	@Column(name = "Title", nullable = false, length = 20)
	private String title;

	@Column(name = "Author", nullable = false, length = 20)
	private String author;

	@OneToOne(optional = false)
	@JoinColumn(name = "CategoryId")
	private Category categoryId;

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Category getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}

}
