package com.pointwest.workforce.planner.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	public User() {
		super();
	}
	
	@Id
	@Column(name="username")
	private String username;
	
	@Column(name="system_role")
	private String systemRole;
	
	@Column(name="employee_id")
	private int employeeId;
}
