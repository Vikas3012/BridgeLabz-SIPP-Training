public class EmployeeManagementSystemMain {

    public static void main(String[] args) {


        Employee[] employees = new Employee[3];
        Employee e1 = new FullTimeEmployee(101, "Alice", 50000);
        e1.assignDepartment("HR");

        Employee e2 = new PartTimeEmployee(102, "Bob", 300, 20);
        e2.assignDepartment("IT");

        Employee e3 = new FullTimeEmployee(103, "Charlie", 60000);
        e3.assignDepartment("Finance");

        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].departmentDetails());;
        }
    }
}
