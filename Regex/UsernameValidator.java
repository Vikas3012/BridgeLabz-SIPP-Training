import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter username : ");
        String username = sc.nextLine();
        
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        
        if (username.matches(regex)) {
            System.out.println("\"" + username + "\" → Valid");
        } else {
            System.out.println("\"" + username + "\" → Invalid");
        }
    }
}
