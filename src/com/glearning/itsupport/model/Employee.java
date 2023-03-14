package com.glearning.itsupport.model;

public class Employee {

	private String firstname;
	private String lastname;
	private String password;
	private String emailAddress;
	private String department;
	private String company;

	public Employee(String firstName, String lastName) {
		this.firstname = firstName;
		this.lastname = lastName;

	}

	public Employee(String firstName, String lastName, String emailAddress) {
		this.firstname = firstName;
		this.lastname = lastName;
		this.emailAddress = emailAddress;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getDepartnment() {
		return department;
	}

	public void setDepartnment(String departnment) {
		this.department = departnment;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

public String toString() {
		return "Employee [firstName=" + firstname + ", lastName=" + lastname + ", email=" + emailAddress + ", password="
				+ password + ", department=" + department + ", company=" + company + "]";
	}
}
