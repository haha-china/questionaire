package com.niit.entity;

public class User_g {
	
	private int id_g;
	private String username_g;
	private String password_g;
	
	public User_g() {
		super();
	}
	public int getId_g() {
		return id_g;
	}
	public void setId_g(int id_g) {
		this.id_g = id_g;
	}
	
	public String getUsername_g() {
		return username_g;
	}
	public void setUsername_g(String username_g) {
		this.username_g = username_g;
	}
	public String getPassword_g() {
		return password_g;
	}
	public void setPassword_g(String password_g) {
		this.password_g = password_g;
	}
	public User_g(String name, String psw) {
		this.username_g = name;
		this.password_g = psw;
	}
}
