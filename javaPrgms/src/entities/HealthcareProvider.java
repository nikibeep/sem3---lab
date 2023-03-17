package entities;

public class HealthcareProvider extends Company {
    public HealthcareProvider(String name, String address, String phoneNumber) {
    super(name, address, phoneNumber);
    }
    public void displayHealthcareProviderDetails() {
        System.out.println("Healthcare provider details:");
        displayCompanyDetails();
    }
}
