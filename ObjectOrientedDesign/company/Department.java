package objectmodeling_relationships.company;

import java.util.ArrayList;

public class Department {
	private String departmentName;
	private ArrayList<Employee> employees;
	
	public Department(String departmentName) {
		this.departmentName = departmentName;
		this.employees = new ArrayList<>();
	}
	
	public void addEmployee(String name, String role) {
		Employee emp = new Employee(name, role);
		employees.add(emp);
	}
	
	public void displayDepartmentInfo() {
		System.out.println("Department: " + departmentName);
		 for (Employee emp : employees) {
	            emp.displayEmployeeInfo();
	        }
	        System.out.println();
	}
	
	public void clearDepartment() {
        employees.clear();
    }
}
