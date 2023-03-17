package medic;
public class Hospital {
    public static void main(String[] args) {
        String patientName = args[0];
        int patientAge = Integer.parseInt(args[1]);

        System.out.println("Patient name: " + patientName);
        System.out.println("Patient age: " + patientAge);

        Surgery surgery = new Surgery("appendectomy");
        surgery.perform();
    }
}
