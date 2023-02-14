
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
}

