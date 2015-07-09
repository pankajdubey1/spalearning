package com.xebia.spa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "user_details")
public class User {

	@Column(name = "f_name")
    private String fname;
	
	@Column(name = "l_name")
	private String lname;
	
	@Id
	@Column(name = "u_name")
	private String uname;
	
	@Column(name = "password")
	private String password;
	
	
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
