package Day13;

import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private char gender;
    private String phoneNumber;

    public Person() {
    }

    public Person(String firstName, String lastName, char gender, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void readPersonDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        this.firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        this.lastName = sc.nextLine();
        System.out.print("Enter Gender (M/F): ");
        this.gender = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Enter Phone Number: ");
        this.phoneNumber = sc.nextLine();
    }

    public void displayPersonDetails() {
        System.out.println("\nPerson Details");
        System.out.println("---------------");
        System.out.println("First Name  : " + firstName);
        System.out.println("Last Name   : " + lastName);
        System.out.println("Gender      : " + gender);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
