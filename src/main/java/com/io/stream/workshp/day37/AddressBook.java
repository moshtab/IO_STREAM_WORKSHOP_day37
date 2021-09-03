package com.io.stream.workshp.day37;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBook {
	static List<Contact> list;

	public AddressBook(List<Contact> list2) {
		AddressBook.list = list2;
	}

	public static void main(String[] args) {
		List<Contact> list = new ArrayList<Contact>();

		System.out.println("Welcome to AddressBook program");
		AddressBook addressBook = new AddressBook(list);
		addressBook.addContact();
		// Adding new contact to Addressbook
		addressBook.addContact();
		// Editing the contact details
		addressBook.editContact();
		// deleting contact by console
		addressBook.deleteContact();
		// Adding new contact to Addressbook
		addressBook.addContact();
        // using stream to Display the contacts
		showContacts();

	}

	private void addContact() {
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

		Contact contact = new Contact(firstName, lastName, city, state, email, phoneNumber, zip);

		list.add(contact);

	}

	private static void showContacts() {
		System.out.println("Displaying the contacts of contactPersons");
		List<Object> result = list.stream().collect(Collectors.toList());
		System.out.println(result);

	}

	private void editContact() {
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

		Contact contact = new Contact(firstName, lastName, city, state, email, phoneNumber, zip);

		list.add(contact);

	}

	private void deleteContact() {
		String firstName = " ";
		String lastName = " ";
		String city = " ";
		String state = " ";
		String email = " ";
		String phoneNumber = "";
		String zip = "";
		Contact contact = new Contact(firstName, lastName, city, state, email, phoneNumber, zip);

		list.add(contact);

	}

}
