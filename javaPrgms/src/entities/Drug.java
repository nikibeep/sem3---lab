package entities;

public class Drug {
    private String name;
    private double dosage;
    private String activeIngredient;
    private String indication;
    private String administrationRoute;
    private String approvalStatus;
    private String manufacturerName;
    private double price;
    private boolean availability;
    private ClinicalTrialResults trialResults;
    
    public Drug(String name, double dosage, String activeIngredient, String indication,
                String administrationRoute, String approvalStatus, String manufacturerName,
                double price, boolean availability) {
        this.name = name;
        this.dosage = dosage;
        this.activeIngredient = activeIngredient;
        this.indication = indication;
        this.administrationRoute = administrationRoute;
        this.approvalStatus = approvalStatus;
        this.manufacturerName = manufacturerName;
        this.price = price;
        this.availability = availability;
    }
    
    public void setTrialResults(ClinicalTrialResults trialResults) {
        this.trialResults = trialResults;
    }
    
    public void displayDrugDetails() {
        System.out.println("Drug name: " + this.name);
        System.out.println("Dosage: " + this.dosage);
        System.out.println("Active ingredient: " + this.activeIngredient);
        System.out.println("Indication: " + this.indication);
        System.out.println("Administration route: " + this.administrationRoute);
        System.out.println("Approval status: " + this.approvalStatus);
        System.out.println("Manufacturer name: " + this.manufacturerName);
        System.out.println("Price: " + this.price);
        System.out.println("Availability: " + this.availability);
        if (this.trialResults != null) {
            this.trialResults.getResults();
        }
    }
}

    
