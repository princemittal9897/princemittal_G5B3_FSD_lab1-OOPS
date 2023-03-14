package com.glearning.itsupport.services;

import com.glearning.itsupport.model.Employee;

public interface GenerateCredentials {
	String generateEmailAddress(String firstName, String lastName, String department, String company);

	String generateCredentials(int maxLength);

	void displayCredentials(Employee employee);
}
