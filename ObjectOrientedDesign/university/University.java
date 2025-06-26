package objectmodeling_relationships.university;

import java.util.ArrayList;

public class University {
	private String name;
	private ArrayList<Department> departmentList;
	
	public University(String name) {
		this.name = name;
		this.departmentList = new ArrayList<>();
	}
	
	public void addDepartment(Department derpartment) {
		departmentList.add(derpartment);
	}
	
	public void displayUniversityInfo() {
		System.out.println("University Name: " + name);
		for(Department dept : departmentList) {
			dept.displayDepartmentInfo();
		}
	}
	
    public void deleteUniversity() {
        System.out.println("Deleting university: " + name);
        for (Department dept : departmentList) {
            dept.clearFaculty(); // Optional: cleanup
        }
        departmentList.clear();
        System.out.println("All departments deleted.\n");
    }
}
