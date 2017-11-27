package com.tecsup.integrador.model;

public class User {
	String login;
	String password;
	int userId;
	String firstname;
	String lastname;
	String adress;
	String phone;
	
	
	
	public User() {
		super();
	}



	public User(String login, String password, int userId, String firstname, String lastname, String adress,
			String phone) {
		super();
		this.login = login;
		this.password = password;
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.adress = adress;
		this.phone = phone;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getAdress() {
		return adress;
	}



	public void setAdress(String adress) {
		this.adress = adress;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", userId=" + userId + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", adress=" + adress + ", phone=" + phone + "]";
	}
	
	

}
