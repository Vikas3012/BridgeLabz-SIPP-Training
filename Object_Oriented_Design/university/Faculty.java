package objectmodeling_relationships.university;

public class Faculty {
	private String name;
	private String designation;
	
	public Faculty(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}
	
	public void displayInfo() {
		System.out.println("Name: " + name + ", Designation: " + designation);
	}
	
}
