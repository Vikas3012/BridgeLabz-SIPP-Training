package objectmodeling_relationships.company;

public class Employee {
	private String name;
	private String role;
	
	public Employee(String name, String role) {
		this.name = name;
		this.role = role;
	}
	
	public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name + ", Role: " + role);
    }
}
