package objectmodeling_relationships.university_management;

import java.util.ArrayList;

public class Professor {
	private String name;
	private ArrayList<Course> teachingCourses;
	
	public Professor(String name) {
		this.name = name;
		this.teachingCourses = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void assignCourse(Course course) {
		if(!teachingCourses.contains(course)) {
			teachingCourses.add(course);
			course.setProfessor(this); //association
			System.out.println("Professor " + name + " assigned to " + course.getCourseName());
		}
	}
	public void viewCourses() {
		System.out.println("Courses taught by Professor: " + name);
		for (Course c : teachingCourses) {
			System.out.println("- " + c.getCourseName());
		}
		System.out.println();
	}
}
