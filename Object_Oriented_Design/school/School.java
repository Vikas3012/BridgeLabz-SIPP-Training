package objectmodeling_relationships.school;

import java.util.ArrayList;

public class School {
	private String schoolName;
	private ArrayList<Student> students;
	
	public School(String schoolName) {
		this.schoolName = schoolName;
		this.students = new ArrayList<>();
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void displayStudents() {
		System.out.println("Student in " + schoolName + ": ");
		for(Student s : students) {
			System.out.println("-" + s.getName());
		}
		System.out.println();
	}
}
