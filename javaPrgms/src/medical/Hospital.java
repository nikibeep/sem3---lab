package medical;

public class Hospital {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Hospital <patient name> <patient age>");
            System.exit(1);
        }

        String patientName = args[0];
        int patientAge = Integer.parseInt(args[1]);
        Patient patient = new Patient(patientName, patientAge);

        MedicalProcedure procedure = new Surgery(patient);
        procedure.perform();
    }
}

