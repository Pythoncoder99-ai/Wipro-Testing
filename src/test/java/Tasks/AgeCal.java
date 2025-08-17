package Tasks;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCal {

    static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    static Period calculateAge(LocalDate dob) {
        return Period.between(dob, LocalDate.now());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String fName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lName = sc.nextLine();

        System.out.print("Enter date of birth (yyyy-mm-dd): ");
        LocalDate dob = LocalDate.parse(sc.nextLine());

        String fullName = getFullName(fName, lName);
        Period age = calculateAge(dob);

        System.out.println("\nFull Name: " + fullName);
        System.out.println("Age: " + age.getYears() + " years " + age.getMonths() + " months " + age.getDays() + " days");

        sc.close();
    }
}
