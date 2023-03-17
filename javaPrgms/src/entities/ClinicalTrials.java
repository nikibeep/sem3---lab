package entities;

public class ClinicalTrials implements ClinicalTrialResults {
    private String name;
    private int duration;
    private String results;
    
    public ClinicalTrials(String name, int duration, String results) {
        this.name = name;
        this.duration = duration;
        this.results = results;
    }
    
    public void getResults() {
        System.out.println("Clinical trial results: " + this.results);
    }
    
    public void displayClinicalTrialDetails() {
        System.out.println("Clinical trial name: " + this.name);
        System.out.println("Duration: " + this.duration + " months");
    }
}
