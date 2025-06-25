public class EmployeeMain {
    public static void main(String[] args) {


        Employee emp1 = new Employee(101, "Riya Sharma", "Software Engineer");
        Employee emp2 = new Employee(102, "Arjun Mehta", "Project Manager");


        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();
        System.out.println();


        Employee.displayTotalEmployees();
    }
}
