package main;

import data.Address;
import data.Manager;

public class Impl {
    public static void main(String[] args) {
        //creating manager object and initializing values
        Manager manager = new Manager();
        manager.setName("Daniel");
        manager.setTeamRatings(5);
        manager.setTeamSize(5);
        manager.setAge(25);
        manager.setDob("25.06.1997");
        manager.setSalary(50000);

        //creating address object and initializing values
        Address address = new Address();
        address.setHouseNumber(5);
        address.setStreet("Kapoorthala");
        address.setCity("Lucknow");
        address.setCountry("India");
        address.setZipCode(245697);
        // setting the value that above initialize with above adress
        manager.setAddress(address);

        manager.show();
    }
}
