import entities.*;

public class Pharma {
public static void main(String[] args) {
// Create a Drug object with command line arguments
Drug drug = new Drug(args[0], Double.parseDouble(args[1]), args[2], args[3], args[4],
args[5], args[6], Double.parseDouble(args[7]), Boolean.parseBoolean(args[8]));
// Create a ClinicalTrials object and set it as the trial results for the drug
ClinicalTrials trials = new ClinicalTrials(args[9], Integer.parseInt(args[10]), args[11]);
drug.setTrialResults(trials);

    // Display the drug details
    drug.displayDrugDetails();
}
}