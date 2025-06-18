import java.util.Scanner;

public class CustomTrimComparision {
    public static String customTrim(String line){
        int start = 0, end = line.length() - 1;
        while(start <= end && line.charAt(start) == ' ') start++;
        while(end >= start && line.charAt(end) == ' ')end--;
        StringBuilder str = new StringBuilder();
        for (int i = start; i <= end; i++) {
            str.append(line.charAt(i));
        }
        return str.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String customResult = customTrim(input);
        String builtInResult = input.trim();
        System.out.println("Custom Trim Output: " + customResult);
        System.out.println("Builtin Trim Output: " + builtInResult);
        System.out.println("Are both Output's are same: " + customResult.equals(builtInResult));
    }
}
