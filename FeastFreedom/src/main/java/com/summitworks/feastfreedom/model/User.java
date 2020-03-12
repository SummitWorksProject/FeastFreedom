package com.summitworks.feastfreedom.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "Id")
	private String id;
	
	@Column(name="First_Name")
	private String first_Name;
	
	@Column(name="Last_Name")
	private String last_Name;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="Security_Question_1")
	private String security_Question_1;
	
	@Column(name="Answer1")
	private String answer1;
	
	@Column(name="Security_Question_2")
	private String security_Question_2;
	
	@Column(name="Answer2")
	private String answer2;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurity_Question_1() {
		return security_Question_1;
	}

	public void setSecurity_Question_1(String security_Question_1) {
		this.security_Question_1 = security_Question_1;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getSecurity_Question_2() {
		return security_Question_2;
	}

	public void setSecurity_Question_2(String security_Question_2) {
		this.security_Question_2 = security_Question_2;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
