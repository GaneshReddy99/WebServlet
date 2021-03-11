package com.ltts.WebProject.model;

public class User {
	private String Name;
	private String email;
	private String username;
	private String password;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String Name, String email, String username, String password) {
		super();
		this.Name = Name;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [name=" + Name + ", email=" + email + ", username=" + username + ", password=" + password + "]";
	}
	

}
