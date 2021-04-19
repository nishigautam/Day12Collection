package com.bridgelabz;

public class AddressDetail {
    /**
     * assigning all the details giving its value
     *
     * creating contact details inside AddressBook
     */
    public String firstname;
    public String lastname;
    public String address;
    public String city;
    public String state;
    public int zipcode;
    public String phoneNumber;
    public String email;

    /**
     * assigning variables to each details
     * @param firstname
     * @param lastname
     * @param address
     * @param city
     * @param state
     * @param zipcode
     * @param phoneNumber
     * @param email
     */
    public AddressDetail(String firstname, String lastname, String address, String city,
                         String state, int zipcode, String phoneNumber, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /**
     * display the contact created in address book.
     */
    public void printAddressBook() {
        System.out.println("First Name:" + this.firstname);
        System.out.println("Last Name:" + this.lastname);
        System.out.println("Address:" + this.address);
        System.out.println("State:" + this.state);
        System.out.println("City:" + this.city);
        System.out.println("Zipcode:" + this.zipcode);
        System.out.println("Phone Number:" + this.phoneNumber);
        System.out.println("Email-ID:" + this.email);
    }
}