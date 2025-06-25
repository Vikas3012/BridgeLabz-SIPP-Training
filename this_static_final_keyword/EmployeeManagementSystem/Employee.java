public class Employee {

    static String companyName = "TechNova Solutions";
    static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company     : " + companyName);
            System.out.println("Employee ID : " + id);
            System.out.println("Name        : " + name);
            System.out.println("Designation : " + designation);
        } else {
            System.out.println("Invalid object. Not an Employee.");
        }
    }
}
