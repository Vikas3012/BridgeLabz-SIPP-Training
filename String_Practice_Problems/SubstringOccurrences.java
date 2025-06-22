import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();
        System.out.print("Enter substring to find: ");
        String subStr = sc.nextLine();

        int count = 0;
        for (int i = 0; i <= mainStr.length() - subStr.length(); i++) {
            if (mainStr.substring(i, i + subStr.length()).equals(subStr)) {
                count++;
            }
        }
        System.out.println("Number of occurrences: " + count);
    }
}
