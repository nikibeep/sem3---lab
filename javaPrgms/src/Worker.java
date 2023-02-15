import java.util.Scanner;

public class Worker {
    String name;
    int hoursWorked;
    double wagePerHour;
    double totalWage;

    void read() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter worker name: ");
        name = input.nextLine();
        System.out.println("Enter hours worked per day: ");
        hoursWorked = input.nextInt();
        System.out.println("Enter wage per hour: ");
        wagePerHour = input.nextDouble();
    }

    void calcwg() {
        totalWage = hoursWorked * wagePerHour;
    }

    void extraWage() {
        if (totalWage < 200) {
            totalWage += 150;
        } else {
            totalWage += 50;
        }
    }

    void TotalWage() {
        System.out.println("Total wage: " + totalWage);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Hours worked per day: " + hoursWorked);
        System.out.println("Wage per hour: " + wagePerHour);
        System.out.println("Total wage: " + totalWage);
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.read();
        worker.calcwg();
        worker.extraWage();
        worker.TotalWage();
        worker.display();
    }
}
