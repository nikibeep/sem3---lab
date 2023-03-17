package entities;

public class Company {
    private String name;
    private String address;
    private String phoneNumber;
    
    public Company(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public void displayCompanyDetails() {
        System.out.println("Company name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Phone number: " + this.phoneNumber);
    }
}
