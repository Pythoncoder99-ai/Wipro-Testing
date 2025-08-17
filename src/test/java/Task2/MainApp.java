package Task2;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        
        Person smithP = new Person("Smith", 30f);
        Person kathyP = new Person("Kathy", 28f);

        Account smithAcc = new SavingsAccount(smithP, 2000.0);
        Account kathyAcc = new CurrentAccount(kathyP, 3000.0, 1000.0); 

        System.out.println("Initial Accounts:");
        System.out.println(smithAcc);
        System.out.println(kathyAcc);

        
        smithAcc.deposit(2000.0);
        System.out.println("\nAfter depositing INR 2000 to Smith:");
        System.out.println(smithAcc);

        
        boolean ok = kathyAcc.withdraw(2000.0);
        System.out.println("\nWithdraw INR 2000 from Kathy: " + (ok ? "Success" : "Failed"));
        System.out.println(kathyAcc);

      
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Employee Insurance ---");
        System.out.print("Enter Employee ID: ");
        int id = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter Name: ");
        String name = sc.nextLine().trim();
        System.out.print("Enter Salary: ");
        double sal = Double.parseDouble(sc.nextLine().trim());
        System.out.print("Enter Designation: ");
        String desig = sc.nextLine().trim();

        Employee emp = new Employee(id, name, sal, desig);
        EmployeeService service = new EmployeeServiceImpl();
        service.assignInsuranceScheme(emp);
        service.displayEmployee(emp);

        sc.close();
    }
}
