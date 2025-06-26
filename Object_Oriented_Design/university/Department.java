package objectmodeling_relationships.university;

import java.util.ArrayList;

public class Department {
	private String departmentName;
	private ArrayList<Faculty> facultyList;
	
	public Department(String departmentName) {
		this.departmentName = departmentName;
		this.facultyList = new ArrayList<>();
	}
	
	public void assignFaculty(Faculty faculty) {
		facultyList.add(faculty);
	}
	
	public void displayDepartmentInfo() {
		System.out.println("Department Name: " + departmentName);
		for(Faculty f : facultyList) {
			f.displayInfo();
		}
		System.out.println();
	}
	
	public void clearFaculty() {
		facultyList.clear();
	}

}
