//Entity: Companies
public class Companies {
    private String companyName;
    private String companyType;
    private int numOfEmployees;
    private String address;
    private String phoneNumber;
    private String email;
    
        //Constructor Overloading
        public Companies() {
        }
        
        public Companies(String companyName, String companyType, int numOfEmployees, String address, String phoneNumber, String email) {
            this.companyName = companyName;
            this.companyType = companyType;
            this.numOfEmployees = numOfEmployees;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }
        
        //Method Overloading
        public void displayInformation() {
            System.out.println("Company Name: " + companyName);
            System.out.println("Company Type: " + companyType);
            System.out.println("Number of Employees: " + numOfEmployees);
            System.out.println("Address: " + address);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Email: " + email);
        }
        
        public void displayInformation(boolean showContactInfo) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Company Type: " + companyType);
            System.out.println("Number of Employees: " + numOfEmployees);
            if (showContactInfo) {
                System.out.println("Address: " + address);
                System.out.println("Phone Number: " + phoneNumber);
                System.out.println("Email: " + email);
            }
        }
    
        //Entity: Manufacturers
        public class Manufacturers {
        private String manufacturerName;
        private String address;
        private String phoneNumber;
        private String email;
    
        //Constructor Overloading
        public Manufacturers() {
        }
        
        public Manufacturers(String manufacturerName, String address, String phoneNumber, String email) {
            this.manufacturerName = manufacturerName;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }
        
        //Method Overriding
        public void displayInformation() {
            System.out.println("Manufacturer Name: " + manufacturerName);
            System.out.println("Address: " + address);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Email: " + email);
        }
    
        public String getManufacturerName() {
            return manufacturerName;
        }
    
        public void setManufacturerName(String manufacturerName) {
            this.manufacturerName = manufacturerName;
        }
    
        public String getAddress() {
            return address;
        }
    
        public void setAddress(String address) {
            this.address = address;
        }
    
        public String getPhoneNumber() {
            return phoneNumber;
        }
    
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    
        public String getEmail() {
            return email;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }
        }
        
        //Entity: Distributors
        public class Distributors {
        private String distributorName;
        private String address;
        private String phoneNumber;
        private String email;
        
    
        //Constructor Overloading
        public Distributors() {
        }
        
        public Distributors(String distributorName, String address, String phoneNumber, String email) {
            this.distributorName = distributorName;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }
        
        //Method Overriding
        public void displayInformation() {
            System.out.println("Distributor Name: " + distributorName);
            System.out.println("Address: " + address);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Email: " + email);
        }
        }
        
        //Entity: Healthcare Providers
        public class HealthcareProviders {
        private String providerName;
        private String providerType;
        private String address;
        private String phoneNumber;
        private String email;
        
        //Constructor Overloading
        public HealthcareProviders() {
        }
        
        public HealthcareProviders(String providerName, String providerType, String address, String phoneNumber, String email) {
            this.providerName = providerName;
            this.providerType = providerType;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }
        
        //Method Overloading
        public void displayInformation() {
            System.out.println("Healthcare Provider Name: " + providerName);
            System.out.println("Provider Type: " + providerType);
            System.out.println("Address: " + address);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Email: " + email);
        }
        
        public void displayInformation(boolean showContactInfo) {
            System.out.println("Healthcare Provider Name: " + providerName);
            System.out.println("Provider Type: " + providerType);
            if (showContactInfo) {
                System.out.println("Address: " + address);
                System.out.println("Phone Number: " + phoneNumber);
                System.out.println("Email: " + email);
            }
        }
        }
        
        //Main class
        public class Main {
            public static void main(String[] args) {
            //Creating objects
           // Drugs drug1 = new Drugs("Aspirin", "500mg", "Acetylsalicylic Acid", "Pain Relief", "Oral", "Approved", "Pfizer", 5.99, true);
            Companies company1 = new Companies("Pfizer", "Pharmaceutical", 22000, "235 E 42nd St, New York, NY 10017", "1-212-733-2323", "contact@pfizer.com");
            Manufacturers manufacturer1 = new Manufacturers("Pfizer", "235 E 42nd St, New York, NY 10017", "1-212-733-2323", "contact@pfizer.com");
            Distributors distributor1 = new Distributors("ABC Distributors", "123 Main St, New York, NY 10001", "1-212-555-5555", "contact@abcdistributors.com");
            HealthcareProviders provider1 = new HealthcareProviders("Dr. John Doe", "General Practitioner", "456 7th Ave, New York, NY 10001", "1-212-888-8888", "johndoe@gmail.com");
    
            //Calling methods
           // drug1.displayInformation();
            company1.displayInformation();
            manufacturer1.displayInformation();
            distributor1.displayInformation();
            provider1.displayInformation();
            provider1.displayInformation(true);
            }
        }
    }