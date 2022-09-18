package com.bridgelabz.addressbook;

import java.util.ArrayList;
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
			System.out.println("Enter your choice");
			choice = sc.nextInt();

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
			}
		} while (choice != 0);
		
		System.out.println("Invalid Choice!!!");
	}
		
}


