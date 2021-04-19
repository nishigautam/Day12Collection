package com.bridgelabz;

public class AddressBookMain {
    /**
     * UC1: creates address detail of a person.
     * @param args
     * @return printAddressBook
     */
    public static void main(String[] args) {
        PersonDetail personDetail = new PersonDetail("Nishi", "Gautam", "193-Gomtinagar",
                "Lucknow", "UP", 226016, "8948372938", "nishigautam@gmail.com");
        personDetail.printAddressBook();

        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
    }
}
