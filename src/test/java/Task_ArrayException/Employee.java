package Task_ArrayException;

public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) throws InvalidNameException {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new InvalidNameException("First name cannot be blank.");
        }

        if (lastName == null || lastName.trim().isEmpty()) {
            throw new InvalidNameException("Last name cannot be blank.");
        }

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void displayFullName() {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }
}
