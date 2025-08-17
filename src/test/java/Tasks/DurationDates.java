package Tasks;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DurationDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first date (yyyy-mm-dd): ");
        String firstDateStr = sc.nextLine();
        System.out.print("Enter second date (yyyy-mm-dd): ");
        String secondDateStr = sc.nextLine();
        LocalDate date1 = LocalDate.parse(firstDateStr);
        LocalDate date2 = LocalDate.parse(secondDateStr);
        if (date1.isAfter(date2)) {
            LocalDate temp = date1;
            date1 = date2;
            date2 = temp;
        }
        Period duration = Period.between(date1, date2);
        System.out.println("\nDuration between the two dates:");
        System.out.println(duration.getYears() + " years");
        System.out.println(duration.getMonths() + " months");
        System.out.println(duration.getDays() + " days");

        sc.close();
    }
}
