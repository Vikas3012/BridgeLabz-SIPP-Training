package objectmodeling_relationships.university_management;

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
			course.addStudent(this); // two-way association
			System.out.println(name + " enrolled in " + course.getCourseName());
		}
	}
	
	public void viewCourses() {
		System.out.println("Courses for Student: " + name);
		for (Course c : enrolledCourses) {
			System.out.println("- " + c.getCourseName());
		}
		System.out.println();
	}
}
