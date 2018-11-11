package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "nutrientfix.com";//company name added
	
	//constructor to recieve the first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;//keyword .this is referring to the class level variable. 
			//defining variable through the API
//		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
//	
		//call a method asking for the department + return the department
		//class variable dept setting it to
			this.department = setDepartment();
			System.out.println("Department: " + this.department);
	
	//call a method that returns a random password
			this.password = randomPassword(defaultPasswordLength);
			System.out.println("Your password is: " + this.password);
			
			//combine elements to generate an email
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
//			System.out.println("Your email is: " + email);
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.print("New worker: " + firstName + " DEPARTMENT CODES:\n1 for Sales\n2 for software\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "sales";}
		else if (depChoice == 2) { return "software";}
		else if (depChoice == 3) { return "acct";}
		else { return "";}
	}
	//Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFhytgfredswervcbnmkloGHIJKLMNOP1234567890!$£%@";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());// zero and 1*by whatever character length. Stored in int random
			password[i] = passwordSet.charAt(rand); // at the position i, we want that to equal the passwordSet.
				
		}
		return new String(password);
	}
	//set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail; //set methods
	}
	
	//change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() { return mailboxCapacity;}
	public String getAlternateEmail() { return alternateEmail;}
	public String getPassword() { return password;}
	
	public String showInfo() { // to show name, email and mailbox capacity
		return "DISPLAY NAME: " + firstName + " " + lastName + " " +
				"\nCOMPANY EMAIL: " + email + " " +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
	}
	

