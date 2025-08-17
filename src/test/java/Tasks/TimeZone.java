package Tasks;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeZone {

    public static void printCurrentDateTime(String zoneIdStr) {
        try {
            ZoneId zoneId = ZoneId.of(zoneIdStr);
            ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
            System.out.println("Current Date & Time in " + zoneIdStr + ": " + zonedDateTime.format(formatter));

        } catch (Exception e) {
            System.out.println("Invalid Zone ID! Please check and try again.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Zone ID (e.g., America/New_York): ");
        String zoneIdStr = sc.nextLine();
        printCurrentDateTime(zoneIdStr);

        sc.close();
    }
}
