package objectmodeling_relationships.school;

public class Main {
	public static void main(String[] args) {
		School mySchool = new School("High School");
		
		Course math = new Course("Mathematics");
		Course phy = new Course("Physics");
		
		Student s1 = new Student("Alice");
		Student s2 = new Student("Bob");
		
		mySchool.addStudent(s1);
		mySchool.addStudent(s2);
		
		s1.enrollCourse(math);
		s1.enrollCourse(phy);
		s2.enrollCourse(phy);
		
		mySchool.displayStudents();
		s1.viewCourses();
		s2.viewCourses();
		
		math.displayEnrolledStudents();
		phy.displayEnrolledStudents();
		
	}
}
