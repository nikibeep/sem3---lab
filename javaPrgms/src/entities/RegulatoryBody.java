package entities;
public class RegulatoryBody {
    private String name;
    private String address;

public RegulatoryBody(String name, String address) {
    this.name = name;
    this.address = address;
}

public void displayRegulatoryBodyDetails() {
    System.out.println("Regulatory body name: " + this.name);
    System.out.println("Address: " + this.address);
}
}