public class Course {
    private String courseName;
    private int duration; // in weeks or months
    private double fee;
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: ₹" + fee +
                           ", Institute: " + instituteName);
    }

    // Class method
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
