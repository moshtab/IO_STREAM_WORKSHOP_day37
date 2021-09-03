package com.io.stream.workshp.day37;

import java.util.Scanner;

public class Contact {
	public String firstName;
	public String lastName;
	public String city;
	public String state;
	public String email;
	public String phoneNumber;
	public String zip;

	public Contact(String firstName, String lastName2, String city2, String state2, String email2, String phoneNumber2,
			String zip2) {
		this.firstName = firstName;
		this.lastName = lastName2;
		this.city = city2;
		this.state = state2;
		this.email = email2;
		this.phoneNumber = phoneNumber2;
		this.zip = zip2;

	}

	public String toString() {
		return "\n FirstName=" + firstName + ", LastName=" + lastName + ", city=" + city + ", state=" + state
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", zip=" + zip + "\n";
	}

	public void addContact() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First name");
		String firstName = s.nextLine();

		System.out.println("Enter the Last name");
		String lastName = s.nextLine();

		System.out.println("Enter the City name");
		String city = s.nextLine();

		System.out.println("Enter the State name");
		String state = s.nextLine();

		System.out.println("Enter the email");
		String email = s.nextLine();

		System.out.println("Enter the Phone number");
		String phoneNumber = s.nextLine();

		System.out.println("Enter the Zip");
		String zip = s.nextLine();
		
	}
}
