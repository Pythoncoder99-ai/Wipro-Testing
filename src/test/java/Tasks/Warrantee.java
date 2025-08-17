package Tasks;

import java.time.LocalDate;
import java.util.Scanner;

public class Warrantee {

    public static LocalDate calculateExpiryDate(LocalDate purchaseDate, int warrantyYears, int warrantyMonths) {
        return purchaseDate.plusYears(warrantyYears).plusMonths(warrantyMonths);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase date (yyyy-mm-dd): ");
        String purchaseDateStr = sc.nextLine();
        LocalDate purchaseDate = LocalDate.parse(purchaseDateStr);
        System.out.print("Enter warranty period in years: ");
        int years = sc.nextInt();
        System.out.print("Enter warranty period in months: ");
        int months = sc.nextInt();
        LocalDate expiryDate = calculateExpiryDate(purchaseDate, years, months);
        System.out.println("\nWarranty Expiry Date: " + expiryDate);

        sc.close();
    }
}
