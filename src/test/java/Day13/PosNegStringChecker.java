package Day13;

import java.util.Scanner;

public class PosNegStringChecker {

    public static boolean isPositiveString(String str) {
        str = str.toUpperCase(); 
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean result = isPositiveString(input);
        if (result) {
            System.out.println("The string is a positive string.");
        } else {
            System.out.println("The string is not a positive string.");
        }
    }
}
