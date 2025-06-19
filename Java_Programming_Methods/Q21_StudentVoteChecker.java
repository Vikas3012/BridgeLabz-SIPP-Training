import java.util.Scanner;

public class Q21_StudentVoteChecker {
    public boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        Q21_StudentVoteChecker svc = new Q21_StudentVoteChecker();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            System.out.println("Can vote: " + svc.canStudentVote(ages[i]));
        }
    }
}
