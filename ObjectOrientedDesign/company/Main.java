package objectmodeling_relationships.company;

public class Main {
	 public static void main(String[] args) {
	        // Create a company
	        Company techCorp = new Company("TechCorp");

	        // Create departments
	        Department devDept = new Department("Development");
	        devDept.addEmployee("Alice", "Developer");
	        devDept.addEmployee("Bob", "Senior Developer");

	        Department hrDept = new Department("Human Resources");
	        hrDept.addEmployee("Carol", "HR Manager");

	        // Add departments to company
	        techCorp.addDepartment(devDept);
	        techCorp.addDepartment(hrDept);

	        // Display info
	        techCorp.displayCompanyInfo();

	        // Delete company (composition: departments & employees also gone)
	        techCorp.shutdownCompany();

	        // Try displaying again (should show nothing)
	        techCorp.displayCompanyInfo();
	    }
}
