package entities;

public class Distributor extends Company {
    public Distributor(String name, String address, String phoneNumber) {
    super(name, address, phoneNumber);
    }
    
    public void displayDistributorDetails() {
        System.out.println("Distributor details:");
        displayCompanyDetails();
    }
}
