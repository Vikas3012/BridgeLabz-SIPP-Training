package objectmodeling_relationships.university_management;

import java.util.ArrayList;

public class Course {
	private String courseName;
	private Professor professor;
	private ArrayList<Student> students;

	public Course(String courseName) {
		this.courseName = courseName;
		this.students = new ArrayList<>();
	}

	public String getCourseName() {
		return courseName;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public void addStudent(Student student) {
		if (!students.contains(student)) {
			students.add(student);
		}
	}

	public void displayCourseInfo() {
		System.out.println("Course: " + courseName);
		System.out.println("Professor: " + (professor != null ? professor.getName() : "TBD"));
		System.out.println("Enrolled Students:");
		for (Student s : students) {
			System.out.println("- " + s.getName());
		}
		System.out.println();
	}
}
