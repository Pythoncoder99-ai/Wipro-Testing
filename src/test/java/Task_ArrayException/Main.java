package Task_ArrayException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        try {
            Employee emp = new Employee(firstName, lastName);
            emp.displayFullName();
        } catch (InvalidNameException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
