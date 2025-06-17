import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        int[][] marks = new int[n][3];  // 3 subjects: physics, chemistry, maths
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                while (true) {
                    int mark = input.nextInt();
                    if (mark < 0) {
                        System.out.println("Please enter positive marks.");
                    } else {
                        marks[i][j] = mark;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (total / 300.0) * 100;

            double p = percentages[i];
            if (p >= 80) grades[i] = 'A';
            else if (p >= 70) grades[i] = 'B';
            else if (p >= 60) grades[i] = 'C';
            else if (p >= 50) grades[i] = 'D';
            else if (p >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }

        System.out.println("\nStudent Report:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%c\n", i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        input.close();
    }
}
