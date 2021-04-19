package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * the below method is for adding the contact into address book
 */
public class AddressBook implements AddressBookAdd {
    List<PersonDetail> contact = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    @Override
    public void addContact() {
        System.out.println("Enter Firstname:");
        String firstname = input.nextLine();

        System.out.println("Enter Lastname:");
        String lastname = input.nextLine();

        System.out.println("Enter Address:");
        String address = input.nextLine();

        System.out.println("Enter City:");
        String city = input.nextLine();

        System.out.println("Enter State:");
        String state = input.nextLine();

        System.out.println("Enter ZipCode:");
        int zipcode = input.nextInt();

        System.out.println("Enter PhoneNumber:");
        String phoneNumber = input.nextLine();

        System.out.println("Enter Email-ID:");
        String email = input.nextLine();

        PersonDetail personDetail = new PersonDetail(firstname, lastname, address, city, state, zipcode, phoneNumber, email);
        contact.add(personDetail);
        System.out.println(" Firstname=" + firstname + ", Lastname=" + lastname + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode +
                ", PhoneNumber=" + phoneNumber + ", email=" + email );
        System.out.println("Contact Added Successfully");
    }

    public void display() {
        for ( PersonDetail personDetail : contact ) {
            System.out.println(personDetail);
        }
    }
}