import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeSystem {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Grade Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students (Pending)");
            System.out.println("3. Search Student (Pending)");
            System.out.println("4. Calculate Average (Pending)");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: addStudent(); break;
                case 5: System.exit(0);
                default: System.out.println("Feature coming soon or invalid choice!");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        
        studentList.add(new Student(id, name, marks));
        System.out.println("Student added successfully!");
    }
}
