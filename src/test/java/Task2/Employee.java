package Task2;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private String insuranceScheme;

    public Employee(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.insuranceScheme = "";
    }

    // getters & setters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public String getDesignation() { return designation; }
    public String getInsuranceScheme() { return insuranceScheme; }
    public void setInsuranceScheme(String s) { this.insuranceScheme = s; }

    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + name + ", salary=" + salary +
               ", designation=" + designation + ", insurance=" + insuranceScheme + "]";
    }
}
