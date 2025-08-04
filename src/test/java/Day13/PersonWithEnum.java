package Day13;

import java.util.Scanner;

enum Gender {
    M, F
}

public class PersonWithEnum {

    private String firstName;
    private String lastName;
    private Gender gender;
    private String phoneNumber;

    public PersonWithEnum() {
    }

    public PersonWithEnum(String firstName, String lastName, Gender gender, String phoneNumber) {
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
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

        while (true) {
            System.out.print("Enter Gender (M/F): ");
            String genderInput = sc.nextLine().toUpperCase();
            if (genderInput.equals("M") || genderInput.equals("F")) {
                this.gender = Gender.valueOf(genderInput);
                break;
            } else {
                System.out.println("Invalid input. Please enter only 'M' or 'F'.");
            }
        }

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
