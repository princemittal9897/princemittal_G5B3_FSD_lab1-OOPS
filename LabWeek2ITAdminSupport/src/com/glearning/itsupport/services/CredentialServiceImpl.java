package com.glearning.itsupport.services;

import com.glearning.itsupport.model.Employee;
import java.util.Random;

public class CredentialServiceImpl implements GenerateCredentials {
	private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
	private static final String NUMBER = "0123456789";
	private static final String SPECIAL_CHARS = "!@#$%^&*()_";
	private static final String PASSWORD_ALLOW_BASE = UPPER_CASE + LOWER_CASE + NUMBER + SPECIAL_CHARS;

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department, String company) {
		String emailAddress = firstName + lastName + "@" + department + "." + company + ".com";
		return emailAddress;
	}

	@Override
	public String generateCredentials(int maxLength) {

		Random random = new Random();
		StringBuilder passwordBuilder = new StringBuilder(maxLength);
		passwordBuilder.append(UPPER_CASE.charAt(random.nextInt(UPPER_CASE.length())));
		passwordBuilder.append(LOWER_CASE.charAt(random.nextInt(LOWER_CASE.length())));
		passwordBuilder.append(NUMBER.charAt(random.nextInt(NUMBER.length())));
		passwordBuilder.append(SPECIAL_CHARS.charAt(random.nextInt(SPECIAL_CHARS.length())));
		for (int i = 4; i < maxLength; i++) {
			passwordBuilder.append(PASSWORD_ALLOW_BASE.charAt(random.nextInt(PASSWORD_ALLOW_BASE.length())));
		}

		char[] passwordChars = passwordBuilder.toString().toCharArray();
		for(int i = 0;i< passwordChars.length;i++) {
			int j = random.nextInt(passwordChars.length);
			char temp = passwordChars[i];
			passwordChars[i] = passwordChars[j];
			passwordChars[j] = temp;
		}
		
		return new String(passwordChars);
	}

	@Override
	public void displayCredentials(Employee employee) {
		 System.out.println("Dear " + employee.getFirstname() + " your generated credentials are as follows ");
				 System.out.println("Email\t\t" + employee.getEmailAddress());
				 System.out.println("Password\t" + employee.getPassword());

	}

}


