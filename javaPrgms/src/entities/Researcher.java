package entities;

public class Researcher {
    private String name;
    private String specialization;
    private int experience;
    
    public Researcher(String name, String specialization, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
    }
    
    public void displayResearcherDetails() {
        System.out.println("Researcher name: " + this.name);
        System.out.println("Specialization: " + this.specialization);
        System.out.println("Experience: " + this.experience);
    }
}
