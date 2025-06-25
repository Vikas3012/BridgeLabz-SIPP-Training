public class Student {

    static String universityName = "Global Tech University";
    static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private String grade;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Enrolled Students: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University : " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name       : " + name);
            System.out.println("Grade      : " + grade);
        } else {
            System.out.println("Invalid object. Not a Student.");
        }
    }

    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for Roll No " + rollNumber);
        } else {
            System.out.println("Cannot update grade. Invalid object.");
        }
    }
}
