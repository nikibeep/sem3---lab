package medical;

public class Surgery implements MedicalProcedure {
    private Patient patient;

    public Surgery(Patient patient) {
        this.patient = patient;
    }

    @Override
    public void perform() {
        System.out.println("Performing surgery on " + patient.getName() + ", age " + patient.getAge());
    }
}
