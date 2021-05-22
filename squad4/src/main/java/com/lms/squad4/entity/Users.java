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
	@Column(name="UserId",nullable=false, updatable=false)
	private long userId;
	
	@Column(name="FName",nullable=false,length=20)
	private String fName;
	
	@Column(name="LName",nullable=false,length=20)
	private String lName;
	
	@Column(name="Password",nullable=false,length=20)
	private String password;

	@OneToOne(optional = false)
	@JoinColumn(name = "RollId")
	private Users rollId;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Users getRollId() {
		return rollId;
	}

	public void setRollId(Users rollId) {
		this.rollId = rollId;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", " + (fName != null ? "fName=" + fName + ", " : "")
				+ (lName != null ? "lName=" + lName + ", " : "")
				+ (password != null ? "password=" + password + ", " : "") + (rollId != null ? "rollId=" + rollId : "")
				+ "]";
	}
	
	
	
	
}
