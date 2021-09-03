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

	static AddressBook addressBook = new AddressBook(list);

	public static void main(String[] args) {
		List<Contact> list = new ArrayList<Contact>();

		System.out.println("Welcome to AddressBook program");
		AddressBook addressBook = new AddressBook(list);
		AddressBook addressBook2 = new AddressBook(list);
		AddressBook addressBook3 = new AddressBook(list);

		addressBook.addContact();
		// Adding new contact to Addressbook
		addressBook.addContact();
		// Editing the contact details
		addressBook.editContact();
		// deleting contact by console
		addressBook.deleteContact();
		// Adding multiple contact to Addressbook
		addressBook.addingMultipleContacts();
		// Adding new contact to Addressbook2
		addressBook2.addContact();
		// using stream to Display the contacts
		showContacts();
		// searching for Name is present or not
		searchingContact();

	}

	private void addContact() {
		System.out.println("Adding a new contact to Addressbook");
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
		System.out.println("Editing the contact details");
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
		System.out.println("Deleting the contacts");
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

	private void addingMultipleContacts() {
		System.out.println("Adding multiple contacts to addressbook");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many contacts do u want to add?");
		int numOfContacts = s.nextInt();
		for (int i = 1; i <= numOfContacts; i++) {

			addressBook.addContact();
		}

	}

	private static void searchingContact() {
		for (Contact i : list) {
			if (i.firstName.contentEquals("Mohsin")) {

				System.out.println("Name found :" + i.firstName);
			} else {
				System.out.println("No match");
			}
		}

	}

}
