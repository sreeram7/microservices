package com.mandasriram.photoapp.api.users.ui.model;

import javax.validation.constraints.*;

public class UserCreateRequestModel {
	
	@NotNull(message="First Name cant be null")
	private String firstName;
	
	@NotNull(message="last Name cant be null")
	@Size(min=2,message="password should be morethan 2 characters")
	private String lastName;
	
	@NotNull(message="Password cant be null")
	@Size(min=6,max=16)
	private String password;
	
	@NotNull(message="Email cant be null")
	@Email
	private String email;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
