public class PharmaceuticalCompany {

    // Fields (attributes) of a pharmaceutical company
    private String name;
    private String location;
    private int yearFounded;
    private int numberOfEmployees;
    // Static fields are shared by all objects of the class
    private static int numberOfCompanies = 0;

    // Constructors
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
        if (name.equals("John")) {
            System.out.println("Hired new employer: " + name);
        } else {
            System.out.println("Invalid name: " + name);
        }
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
    //constructor to count the number of companies
    public PharmaceuticalCompany() {
        numberOfCompanies++;
    }

    public static int getNumberOfCompanies() {
        return numberOfCompanies;
    }
    // Static block
    static {
        System.out.println("PharmaceuticalCompany class has been loaded.");
    }
    // Static inner class
    public static class Employee {
        private String name;
        private int age;
    
        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }
    
        public String getName() {
            return name;
        }
    
        public int getAge() {
            return age;
        }
    }

        // Main method to run the program
    public static void main(String[] args) {
        // Create a new pharmaceutical company object
        PharmaceuticalCompany company = new PharmaceuticalCompany("My Company", "New York", 2000, 1000);
        // Create a new employee object
        PharmaceuticalCompany.Employee employee = new PharmaceuticalCompany.Employee("John", 30);
        // Call the getter methods to print information about the employee
        employee.getName();
        employee.getAge();
        // Call the introduceCompany method to print information about the company
        company.introduceCompany();
    }
}

