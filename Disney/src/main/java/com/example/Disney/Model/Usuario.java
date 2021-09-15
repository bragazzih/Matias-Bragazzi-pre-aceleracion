package com.example.Disney.Model;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;



import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table (name = "Usuario")

public class Usuario implements Serializable {




	public Usuario() {
		super();
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1958088376785022053L;

	public Usuario(String name, String lastName, String mail, String username, String password) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.mail = mail;
		this.username = username;
		this.password = password;
	}
	
	private String name;
	private String lastName;
	private String mail;
	private String username;
	private String password;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
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
	

	

}
