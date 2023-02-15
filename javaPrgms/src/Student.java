import java.util.Scanner;

public class Student {
    int rollNo;
    String name;
    String course;
    double[] marks = new double[5];
    double percentage;

    public void read() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter roll number: ");
        rollNo = input.nextInt();
        input.nextLine();
        System.out.println("Enter name: ");
        name = input.nextLine();
        System.out.println("Enter course: ");
        course = input.nextLine();
        System.out.println("Enter marks in 5 subjects: ");
        for (int i = 0; i < 5; i++) {
            marks[i] = input.nextDouble();
        }
    }

    public double calculate() {
        double total = 0;
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }
        percentage = (total / 500) * 100;
        return percentage;
    }

    public void display() {
        System.out.println("Roll number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks in 5 subjects: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i+1) + ": " + marks[i]);
        }
        System.out.println("Percentage of marks: " + percentage + "%");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.read();
        double percentage = student.calculate();
        student.display();
    }
}

