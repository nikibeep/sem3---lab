package entities;

public class SalesRepresentative {
    private String name;
    private String phoneNumber;
    
    public SalesRepresentative(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    public void displaySalesRepDetails() {
        System.out.println("Sales representative name: " + this.name);
        System.out.println("Phone number: " + this.phoneNumber);
    }
}


