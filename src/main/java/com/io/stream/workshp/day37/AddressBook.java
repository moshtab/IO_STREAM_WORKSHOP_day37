package com.io.stream.workshp.day37;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBook {
	static List<Contact> list;

	public AddressBook(List<Contact> list2) {
		AddressBook.list = list2;
	}

	static AddressBook addressBook = new AddressBook(list);

	void addContact() {
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
		showContacts();

	}

	public void editContactByName() {

		System.out.println("Editing the contact details of given person");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name which u want to edit");
		String name = s.nextLine();
		for (Contact i : list) {
			if (i.firstName.equals(name)) {
				addressBook.editContact();
				System.out.println("Displaying edited details");
				showContacts();

			} else {
				System.out.println("No Name found");
			}
		}

	}

	public void deleteContactByName() {
		System.out.println("Editing the contact details of given person");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name which u want to delete");
		String name = s.nextLine();
		for (Contact i : list) {
			if (i.firstName.equals(name)) {
				addressBook.deleteContact();
				showContacts();

			} else {
				System.out.println("No Name found");
			}
		}

	}

	public void showContacts() {
		System.out.println("Displaying the contacts of contactPersons");
		List<Object> result = list.stream().collect(Collectors.toList());
		System.out.println(result);

	}

	public void editContact() {

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

	public void deleteContact() {
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

	public void addingMultipleContacts() {
		System.out.println("Adding multiple contacts to addressbook");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many contacts do u want to add?");
		int numOfContacts = s.nextInt();
		for (int i = 1; i <= numOfContacts; i++) {

			addressBook.addContact();
		}

	}

	public void searchingContact() {
		System.out.println("Searching a contact by name============");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name which u want to search");
		String name = s.nextLine();
		for (Contact i : list) {
			if (i.firstName.contentEquals(name)) {

				System.out.println("Name found :" + i.firstName);
			} else {
				System.out.println("No match");
			}
		}

	}

	public void searchNameByCityOrState() {
		System.out.println("Searching the ContactName by city or state==================== ");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the city by which u want to search name");
		String city = s.nextLine();
		System.out.println("Enter the state by which u want to search name");
		String state = s.nextLine();
		System.out.println("Enter the name which u want to search");
		String name = s.nextLine();
		for (Contact i : list) {
			if (i.city.contentEquals(city) && i.state.contentEquals(state) && i.firstName.contentEquals(name)) {

				System.out.println("Name found :" + i.firstName);
			} else {
				System.out.println("No match");
			}
		}

	}

	public void viewContactNamesByCityOrState() {
		System.out.println("Viewing the ContactNames by city or state================ ");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the city by which u want to view names");
		String city = s.nextLine();
		System.out.println("Enter the state by which u want to view names");
		String state = s.nextLine();
		for (Contact i : list) {
			if (i.city.contentEquals(city) || i.state.contentEquals(state)) {
				System.out.println("Name found :" + i.firstName);
			} else {
				System.out.println("No City or State found");
			}
		}

	}

	public void countContactsByCityorState() {
		System.out.println("Counting the ContactNames by city or state================");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the city by which u want to count names");
		String city = s.nextLine();
		System.out.println("Enter the state by which u want to count names");
		String state = s.nextLine();
		int count = 0;
		for (Contact i : list) {
			if (i.city.contentEquals(city) || i.state.contentEquals(state)) {
				count++;
			} else {
				System.out.println("No City or State found");
			}
		}
		System.out.println("Total counts of contacts :" + count);
	}

	void writeIOContact() {
		new AddressBookIOServiceFile().writeIOData(list);

	}

	void readIOContact() {
		new AddressBookIOServiceFile().readIOData();

	}

	void writeContactToCSV() {
		new AddressBookIOServiceFile().writeCSVData(list);

	}

	void readCsvContact() {
		new AddressBookIOServiceFile().readCSVData();

	}

	void writeJsonContact() {
		new AddressBookIOServiceFile().writeJasonData(list);

	}

}
