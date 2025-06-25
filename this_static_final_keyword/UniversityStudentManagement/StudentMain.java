public class StudentMain {
    public static void main(String[] args) {

        Student s1 = new Student(201, "Anika Rao", "A");
        Student s2 = new Student(202, "Rahul Verma", "B");

        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();

        System.out.println();
        s2.updateGrade("A+");
        System.out.println();
        s2.displayStudentDetails();

        System.out.println();
        Student.displayTotalStudents();
    }
}
