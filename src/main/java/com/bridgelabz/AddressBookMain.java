package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    /**
     * creates address detail of a person.
     *
     * @return printAddressBook
     */
    private void choice() {
        boolean result = true;
        Scanner input = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while(result) {
            System.out.println("Enter option to make changes : \n[press 1 to add new Contact" +
                                "\n press 2 to Edit existing contacts" + " \n press 3 to display details " +
                                "\n press 4 to delete a contact detail " + "\n press 0 to quit ]");
            int option = input.nextInt();
            switch (option) {
                case 1 :
                    addressBook.addContact();
                    break;
                case 2 :
                    System.out.println("Enter your firstname to Edit your details..");
                    String firstname = input.next();
                    addressBook.editContact(firstname);
                    break;
                case 3 :
                    addressBook.display();
                    break;
                case 4 :
                    System.out.println("Enter your Firstname to delete your details :");
                    String firstName = input.next();
                    addressBook.deleteContact(firstName);
                    break;
                default:
                    result = false;
            }
        }
    }
    public static void main(String[] args) {
        PersonDetail personDetail = new PersonDetail("Nishi", "Gautam", "193-Gomtinagar",
                "Lucknow", "UP", 226016, "8948372938");
        personDetail.printAddressBook();

        AddressBookMain main = new AddressBookMain();
        main.choice();
    }
}
