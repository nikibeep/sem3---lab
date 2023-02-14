public class PharmaceuticalCompany {

    // Fields (attributes) of a pharmaceutical company
    private String name;
    private String location;
    private int yearFounded;
    private int numberOfEmployees;
    
    // Constructors
    public PharmaceuticalCompany() {
        this.name = "Unknown";
        this.location = "Unknown";
        this.yearFounded = 0;
        this.numberOfEmployees = 0;
    }
    
    public PharmaceuticalCompany(String name, String location) {
        this.name = name;
        this.location = location;
        this.yearFounded = 0;
        this.numberOfEmployees = 0;
    }
    
    public PharmaceuticalCompany(String name, String location, int yearFounded) {
        this.name = name;
        this.location = location;
        this.yearFounded = yearFounded;
        this.numberOfEmployees = 0;
    }
    
    public PharmaceuticalCompany(String name, String location, int yearFounded, int numberOfEmployees) {
        this.name = name;
        this.location = location;
        this.yearFounded = yearFounded;
        this.numberOfEmployees = numberOfEmployees;
    }
    
    // Getter and setter methods for the fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    // Method overloading: different versions of the same method with different parameters
    public void hireEmployee(String name) {
        System.out.println("Hired new employee: " + name);
    }
    
    public void hireEmployee(String name, String position) {
        System.out.println("Hired new employee: " + name + " as " + position);
    }
    
    public void hireEmployee(String name, String position, int salary) {
        System.out.println("Hired new employee: " + name + " as " + position + " with salary " + salary);
    }
    
    // Method overriding: replacing a method of a parent class with a new implementation in a child class
    public void introduceCompany() {
        System.out.println("We are a pharmaceutical company based in " + location);
    }
}
