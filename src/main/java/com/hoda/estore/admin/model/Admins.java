package com.hoda.estore.admin.model; 

import java.util.Date; 

/** 

* POJO class for Admins  

* @author hodasanij 

* 

*/ 

//encapsulated class with private data properties and public methods 

public class Admins { 

	 

	//data properties  

	private int adminId; 

	private String email; 

	private String password; 

	private String fullName; 

	private int logginType; 

	private Date addedOn; 

	 

	//default constructor 

	public Admins() { 

		super(); 

	} 

	 

	//parameterized constructor 

	public Admins(int adminId, String email, String password, String fullName, int logginType, Date addedOn) { 

		super(); 

		this.adminId = adminId; 

		this.email = email; 

		this.password = password; 

		this.fullName = fullName; 

		this.logginType = logginType; 

		this.addedOn = addedOn; 

	} 

	 

	//getter and setter methods 

	public int getAdminId() { 

		return adminId; 

	} 

	public void setAdminId(int adminId) { 

		this.adminId = adminId; 

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

	public String getFullName() { 

		return fullName; 

	} 

	public void setFullName(String fullName) { 

		this.fullName = fullName; 

	} 

	public int getLogginType() { 

		return logginType; 

	} 

	public void setLogginType(int logginType) { 

		this.logginType = logginType; 

	} 

	public Date getAddedOn() { 

		return addedOn; 

	} 

	public void setAddedOn(Date addedOn) { 

		this.addedOn = addedOn; 

	} 

	 

	//override to string 

	@Override 

	public String toString() { 

		return "Admins [adminId=" + adminId + ", email=" + email + ", password=" + password + ", fullName=" + fullName 

				+ ", logginType=" + logginType + ", addedOn=" + addedOn + "]"; 

	} 

	 

	 

} 