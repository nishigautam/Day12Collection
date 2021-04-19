package com.bridgelabz;

public class AddressBookMain {
    /**
     * UC1: creates address detail of a person.
     * @param args
     * @return printAddressBook
     */
    public static void main(String[] args) {
        AddressDetail addressDetail = new AddressDetail("Nishi", "Gautam", "193-Gomtinagar",
                "Lucknow", "UP", 226016, "8948372938", "nishigautam@gmail.com");
        addressDetail.printAddressBook();
    }
}
