package com.bridgelabz;

public class AddressDetail {
    public String firstname;
    public String lastname;
    public String address;
    public String city;
    public String state;
    public int zipcode;
    public String phoneNumber;
    public String email;

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

    public void printAddressbook() {
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