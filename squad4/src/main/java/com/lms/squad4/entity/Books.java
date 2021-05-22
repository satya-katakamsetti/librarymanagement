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
	@Column(name="id",nullable=false, updatable=false)
	private long bookId;
	
	@Column(name="title",nullable=false,length=20)
	private String title;
	
	@Column(name="author",nullable=false,length=20)
	private String author;
	

	@OneToOne(optional = false)
	@JoinColumn(name = "category_id")
	private Category categoryId;

	
	
}
