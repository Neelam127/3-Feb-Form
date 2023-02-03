package com.cg1.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user")
public class User {
	@Id
	private String userId;
	
	private String firstName;
	private String lastName;
	private String password;
	public User(String firstName, String lastName, String password) {
		
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
	
	
	
	

}
