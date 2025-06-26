package objectmodeling_relationships.school;

import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Course> enrolledCourses;
	
	public Student(String name) {
		this.name = name;
		this.enrolledCourses = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void enrollCourse(Course course) {
		if(!enrolledCourses.contains(course)) {
			enrolledCourses.add(course);
		}
	}
	
	public void viewCourses() {
        System.out.println("Student: " + name + " is enrolled in:");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.getCourseName());
        }
        System.out.println();
    }

}
