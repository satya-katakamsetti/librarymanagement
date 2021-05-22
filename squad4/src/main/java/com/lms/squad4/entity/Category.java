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
@Table(name = "category")
@Data
public class Category {
	
	@Id
	@Column(name="CategoryId",nullable=false, updatable=false)
	private long categoryId;
	
	@Column(name="CategoryName",nullable=false,length=50)
	private String categoryName;

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", "
				+ (categoryName != null ? "categoryName=" + categoryName : "") + "]";
	}
	
	
	
}
