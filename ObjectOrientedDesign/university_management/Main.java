package objectmodeling_relationships.university_management;

public class Main {
	public static void main(String[] args) {
		// Create students
		Student s1 = new Student("Alice");
		Student s2 = new Student("Bob");

		// Create professors
		Professor p1 = new Professor("Dr. Smith");
		Professor p2 = new Professor("Dr. Jane");

		// Create courses
		Course c1 = new Course("Data Structures");
		Course c2 = new Course("Operating Systems");

		// Assign professors
		p1.assignCourse(c1);
		p2.assignCourse(c2);

		// Enroll students
		s1.enrollCourse(c1);
		s1.enrollCourse(c2);
		s2.enrollCourse(c2);

		// Display information
		s1.viewCourses();
		s2.viewCourses();

		p1.viewCourses();
		p2.viewCourses();

		c1.displayCourseInfo();
		c2.displayCourseInfo();
	}
}