public class GenericPharmaceuticalCompany extends PharmaceuticalCompany {
    
    // Constructor overloading: multiple constructors with different parameters
    public GenericPharmaceuticalCompany() {
        super();
    }
    
    public GenericPharmaceuticalCompany(String name, String location) {
        super(name, location);
    }
    
    public GenericPharmaceuticalCompany(String name, String location, int yearFounded) {
        super(name, location, yearFounded);
    }
    
    public GenericPharmaceuticalCompany(String name, String location, int yearFounded, int numberOfEmployees) {
        super(name, location, yearFounded, numberOfEmployees);
    }
    
    // Method overriding: replace the introduceCompany method in the parent class with a new implementation
    @Override
    public void introduceCompany() {
        System.out.println("We are a generic pharmaceutical company based in " + getLocation() 
                            + " founded in " + getYearFounded() + " with " + getNumberOfEmployees() + " employees.");
        
    }
    public static void main(String[] args) {
        GenericPharmaceuticalCompany company = new GenericPharmaceuticalCompany("Generic Pharmaceuticals", "New York", 2000, 1000);
        PharmaceuticalCompany.Employee employee = new PharmaceuticalCompany.Employee("John", 30);
        company.introduceCompany();
        company.hireEmployee("John");
        company.hireEmployee("John", "Manager");
        company.hireEmployee("John", "Manager", 100000);
        System.out.println("Employee name: " + employee.getName()); 
        System.out.println("Employee age: " + employee.getAge());
        System.out.println("Number of companies: " + PharmaceuticalCompany.getNumberOfCompanies());  
     }
}

