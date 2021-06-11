package com.oehm5.hibernate.entity;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="user registration")
public class UserRegistration implements Serializable{

	@Id
	@Column(name="id_name")
	private String username;
	@Column(name="id_login")
	private Long id;
	@Column(name="id_password")
	private String password;
	@Column(name="id_mobileno")
	private String mobileno;
	@Column(name="id_email")
	private String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
