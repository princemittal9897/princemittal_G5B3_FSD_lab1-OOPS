package com.glearning.itsupport.client;
import com.glearning.itsupport.model.*;
import com.glearning.itsupport.services.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CredentialServiceImpl serviceCredential = new CredentialServiceImpl();
		String firstName = "Harshit";
		String lastName = "Chaudary";
		Employee employee = new Employee(firstName,lastName);
		employee.setCompany("TCS");
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		
		switch(option) {
		case 1:{
			String generatedEmail = serviceCredential.generateEmailAddress(employee.getFirstname().toLowerCase(), employee.getLastname().toLowerCase(), "tech",employee.getCompany().toLowerCase());
			String generatedPassword = serviceCredential.generateCredentials(10);
			employee.setEmailAddress(generatedEmail);
			employee.setPassword(generatedPassword);
			serviceCredential.displayCredentials(employee);
			break;
		}
		case 2:{
			String generatedEmail = serviceCredential.generateEmailAddress(employee.getFirstname().toLowerCase(), employee.getLastname().toLowerCase(), "admin",employee.getCompany().toLowerCase());
			String generatedPassword = serviceCredential.generateCredentials(10);
			employee.setEmailAddress(generatedEmail);
			employee.setPassword(generatedPassword);
			serviceCredential.displayCredentials(employee);
	
			break;
		}
		case 3:{
			String generatedEmail = serviceCredential.generateEmailAddress(employee.getFirstname().toLowerCase(), employee.getLastname().toLowerCase(), "hr",employee.getCompany().toLowerCase());
			String generatedPassword = serviceCredential.generateCredentials(10);
			employee.setEmailAddress(generatedEmail);
			employee.setPassword(generatedPassword);
			serviceCredential.displayCredentials(employee);
			
			break;
		}
		case 4:{
			String generatedEmail = serviceCredential.generateEmailAddress(employee.getFirstname().toLowerCase(), employee.getLastname().toLowerCase(), "legal",employee.getCompany().toLowerCase());
			String generatedPassword = serviceCredential.generateCredentials(10);
			employee.setEmailAddress(generatedEmail);
			employee.setPassword(generatedPassword);
			serviceCredential.displayCredentials(employee);	
			break;
		}
		default:
			System.out.println("Please Enter A Valid Option.");
		}		
	}
}