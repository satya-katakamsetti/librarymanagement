package com.lms.squad4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "role")
@Data
public class Role {
	
	@Id
	@Column(name="role_id",nullable=false, updatable=false)
	private long roleId;
	
	@Column(name="user_name",nullable=false,length=20)
	private String roleName;
	
}
