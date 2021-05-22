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
@Table(name = "users")
@Data
public class Users {
	
	@Id
	@Column(name="id",nullable=false, updatable=false)
	private long userId;
	
	@Column(name="user_name",nullable=false,length=20)
	private String fName;
	
	@Column(name="l_name",nullable=false,length=20)
	private String lName;
	
	@Column(name="password",nullable=false,length=20)
	private String password;

	@OneToOne(optional = false)
	@JoinColumn(name = "role_id")
	private Users rollId;

	
	
}
