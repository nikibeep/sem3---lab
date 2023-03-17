package entities;

public class Manufacturer extends Company {
    public Manufacturer(String name, String address, String phoneNumber) {
    super(name, address, phoneNumber);
    }
    
    public void displayManufacturerDetails() {
        System.out.println("Manufacturer details:");
        displayCompanyDetails();
    }
}
