package com.io.stream.workshp.day37;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook program");
		List<Contact> list = new ArrayList<Contact>();

		AddressBook addressBook = new AddressBook(list);
		AddressBook addressBook2 = new AddressBook(list);
		AddressBookJDBC addressBookJDBC = new AddressBookJDBC();
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("1: Add contact1  to the AddressBook");
		System.out.println("2: Add contact2  to the AddressBook");
		System.out.println("3: Edit contact details of AddressBook");
		System.out.println("4: Delete contact details from the AddressBook");
		System.out.println("5: Add multiple contacts  to the AddressBook");
		System.out.println("6: Add contact1  to the AddressBook2");
		System.out.println("7: Searching contactName in the AddressBook");
		System.out.println("8: Searching  contactName By City Or State in AddressBook");
		System.out.println("9: View contactNames By City Or State in AddressBook");
		System.out.println("10: Count contactNames By City Or State in AddressBook");
		System.out.println("11: Writing and Reading addressbook to IO File");
		System.out.println("12: Writing and Reading addressbook to CSV File");
		System.out.println("13: Writing  addressbook to Json File");
		System.out.println("14: Eshtablishig Connection to mysql Database");
		System.out.println("15: Reading the details of addressbook database");
		System.out.println("16: Updating the details of addressbook database");
		System.out.println("17: Displaying Contact the details of addressbook database between given dates");
		System.out.println("18: Counting contacts of addressbook database by city");
		System.out.println("19: Inserting a new conatct to addressbook database");
		addressBook.addContact();
		while (true) {
			System.out.println("Make your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				addressBook.addContact();
				break;
			case 2:
				addressBook.addContact();
				break;
			case 3:
				
				addressBook.editContactByName();
				break;
			case 4:
				
				addressBook.deleteContactByName();
				break;
			case 5:
				addressBook.addingMultipleContacts();
				break;
			case 6:
				addressBook2.addContact();
				break;
			case 7:
				
				addressBook.searchingContact();
				break;
			case 8:
				
				addressBook.searchNameByCityOrState();
				break;
			case 9:
				
				addressBook.viewContactNamesByCityOrState();
				break;
			case 10:
				
				addressBook.countContactsByCityorState();
				break;
			case 11:
				
				addressBook.writeIOContact();
				addressBook.readIOContact();
				break;
			case 12:
				
				addressBook.writeContactToCSV();
				addressBook.readCsvContact();
				break;
			case 13:
				
				addressBook.writeJsonContact();
				break;
			case 14:
				addressBookJDBC.eshtablishConnection();
				break;
			case 15:
				addressBookJDBC.readAddressBook();
				break;
			case 16:
				addressBookJDBC.updateAddressBook();
				break;
			case 17:
				addressBookJDBC.showContactsBetweenGivenDates();
				break;
			case 18:
				addressBookJDBC.countContactsByCity();
				break;
			case 19:
				addressBookJDBC.insertContact();
				break;
			default:
				System.out.println("Invalid choice! Please make a valid choice");

			}

		}

	}

}
