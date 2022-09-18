package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the address book system");
		ArrayList<Contact> array = new ArrayList<Contact>();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.EDIT");
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			Iterator<Contact> iterator;
			switch (choice) {
			case 1:
				System.out.print("Enter First Name: ");
				String firstName = sc1.nextLine();
				System.out.print("Enter last Name: ");
				String lastName = sc1.nextLine();
				System.out.print("Enter your address: ");
				String address = sc1.nextLine();
				System.out.print("Enter your city: ");
				String city = sc1.nextLine();
				System.out.print("Enter your state: ");
				String state = sc1.nextLine();
				System.out.print("Enter zip code : ");
				int zipcode = sc.nextInt();
				System.out.print("Enter phone number: ");
				String phoneNo = sc1.nextLine();
				System.out.print("Enter your email: ");
				String email = sc1.nextLine();
				Contact contact = new Contact(firstName, lastName, address, city, state, zipcode, phoneNo, email);
				array.add(contact);
				break;
			case 2:
				System.out.println(array);
				break;
				
			case 3:
				boolean found = false;
				System.out.println("Enter first name of the person for update ");
				String firstName1 = sc1.nextLine();
				System.out.println("------------------------------------");

				ListIterator<Contact> listIterator = array.listIterator();
				
				while (listIterator.hasNext()) {
					contact = listIterator.next();

					if (contact.getFirstName().equals(firstName1)) { 

						System.out.print("Enter new first Name: ");
						firstName1 = sc1.nextLine();
						System.out.print("Enter new last Name: ");
						lastName = sc1.nextLine();
						System.out.print("Enter your new address: ");
						address = sc1.nextLine();
						System.out.print("Enter your new city: ");
						city = sc1.nextLine();
						System.out.print("Enter your state: ");
						state = sc1.nextLine();
						System.out.print("Enter zip code : ");
						zipcode = sc.nextInt();
						System.out.print("Enter phone number: ");
						phoneNo = sc1.nextLine();
						System.out.print("Enter your eMail ID: ");
						email = sc1.nextLine();
						listIterator.set(new Contact(firstName1, lastName, address, city, state, zipcode,
								phoneNo, email));
						found = true;
					}
				}
				System.out.println("_____________________________________");

				if (!found) {
					System.out.println("Record not found");
				} else {
					System.out.println("Record is updated successfully");
				}
				System.out.println("_______________________________________");
				break;
				
				
			case 4:
				found = false;
				System.out.println("Enter first name of the person for delete ");
				firstName1 = sc1.nextLine();
				System.out.println("____________________________________");
				iterator = array.iterator();
				while (iterator.hasNext()) {
					contact = iterator.next();
					if (contact.getFirstName().equals(firstName1)) {
						iterator.remove();
						found = true;
					}
				}
				System.out.println("____________________________________");
				if (!found) {
					System.out.println("Record not found");
				} else {
					System.out.println("Record is deleted successfully");
				}
				System.out.println("_____________________________________");
				break;
				
			default:
				System.out.println("default");
			}
		} while (choice != 0);
		
		System.out.println("Invalid Choice!!!");
	}
		
}


