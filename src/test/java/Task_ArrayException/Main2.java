package Task_ArrayException;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            Person p = new Person(name, age);
            p.displayDetails();
        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age: " + e.getMessage());
        }
    }
}
