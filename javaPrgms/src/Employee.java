import java.util.Scanner;

public class Employee {
    // Private members
    private int empId;
    private String name;
    private double basicPay;

    // Constructor to initialize empId as 0
    public Employee() {
        empId = 0;
    }

    // Public method to read input values
    public void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter basic pay: ");
        basicPay = sc.nextDouble();
        sc.close();
    }

    // Private method to calculate DA
    private double calculateDA() {
        return 0.5 * basicPay;
    }

    // Private method to calculate HRA
    private double calculateHRA() {
        return 0.1 * basicPay;
    }

    // Public method to calculate total salary
    public double calculateSalary() {
        double da = calculateDA();
        double hra = calculateHRA();
        return basicPay + da + hra;
    }

    // Public method to display output
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Total Salary: " + calculateSalary());
    }

    public static void main(String[] args) {
        // Create an object of Employee class
        Employee emp = new Employee();

        // Read input values
        emp.readData();

        // Set empId to a unique value
        emp.empId = (int) (Math.random() * 1000);

        // Display output
        emp.display();
    }
}

