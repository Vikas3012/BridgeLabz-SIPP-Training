import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecurityNumberValidator {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text : ");
        String text = sc.nextLine();

        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("\"" + matcher.group() + "\" is valid");
        } else {
            System.out.println("No valid SSN found in input");
        }
    }
}
