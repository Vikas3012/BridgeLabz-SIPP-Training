package objectmodeling_relationships.school;

import java.util.ArrayList;

public class Course {
	private String courseName;
	private ArrayList<Student> enrolledStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
		this.enrolledStudents = new ArrayList<>();
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void enrollStudents(Student student) {
		if(!enrolledStudents.contains(student)) {
			enrolledStudents.add(student);
		}	
	}
	
	public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getName());
        }
        System.out.println();
    }
	
}
