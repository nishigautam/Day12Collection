package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressDetail addressDetail = new AddressDetail("Nishi", "Gautam", "193-Gomtinagar",
                "Lucknow", "UP", 226016, "8948372938", "nishigautam@gmail.com");
        addressDetail.printAddressbook();
    }
}
