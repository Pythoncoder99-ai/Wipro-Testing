package Tasks;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date in format (yyyy-mm-dd): ");
        String inputDate = sc.nextLine();
        LocalDate givenDate = LocalDate.parse(inputDate);
        LocalDate currentDate = LocalDate.now();
        Period duration = Period.between(givenDate, currentDate);

        System.out.println("Duration:");
        System.out.println(duration.getYears() + " years");
        System.out.println(duration.getMonths() + " months");
        System.out.println(duration.getDays() + " days");

        sc.close();
    }
}

