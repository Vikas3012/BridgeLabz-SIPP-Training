package objectmodeling_relationships.company;

import java.util.ArrayList;

public class Company {
	private String companyName;
	private ArrayList<Department> departments;
	
	public Company(String companyName) {
		this.companyName = companyName;
		this.departments = new ArrayList<>();
	}
	
	public void addDepartment(Department department) {
		departments.add(department);
	}
	
	public void displayCompanyInfo() {
		System.out.println("Company Name: " + companyName);
		for(Department dept : departments) {
			dept.displayDepartmentInfo();
		}
	}
	
    public void shutdownCompany() {
        System.out.println("Shutting down " + companyName + "...");
        for (Department dept : departments) {
            dept.clearDepartment();
        }
        departments.clear();
        System.out.println("All departments and employees deleted.\n");
    }
}
