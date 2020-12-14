package com.hms.model;

public class Doctor {
	
	private String name;
	private String email;
	private String password;
	private String id;
	private String address;
	private Long phone;
	private String department;
	private String specialization;
	
	public Doctor(){}
	
	public Doctor(String name, String email, String password, String id, String address, Long phone, String department,
			String specialization) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.id = id;
		this.address = address;
		this.phone = phone;
		this.department = department;
		this.specialization = specialization;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhno() {
		return phone;
	}
	public void setPhno(Long phone) {
		this.phone = phone;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSpecilization() {
		return specialization;
	}
	public void setSpecilization(String specialization) {
		this.specialization = specialization;
	}

}
