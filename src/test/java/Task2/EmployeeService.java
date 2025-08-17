package Task2;

import java.util.Scanner;

public interface EmployeeService {
    void assignInsuranceScheme(Employee emp);
    void displayEmployee(Employee emp);
}


class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void assignInsuranceScheme(Employee emp) {
        double s = emp.getSalary();
        String d = emp.getDesignation().toLowerCase();

        if (s >= 50000 && d.contains("manager")) {
            emp.setInsuranceScheme("Platinum");
        } else if (s >= 30000 && d.contains("programmer")) {
            emp.setInsuranceScheme("Gold");
        } else if (s >= 20000 && d.contains("system")) {
            emp.setInsuranceScheme("Silver");
        } else {
            emp.setInsuranceScheme("No Scheme");
        }
    }

    @Override
    public void displayEmployee(Employee emp) {
        System.out.println("\nEmployee Details:");
        System.out.println(emp);
    }
}
