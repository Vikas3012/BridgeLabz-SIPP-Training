import java.util.Scanner;

public class StringCharCompare {
    public static char[] customCharArray(String str){
        char[] charArr = new char[str.length()];
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = str.charAt(i);
        }
        return charArr;
    }
    public static boolean compareCharArrays(char[] a, char[] b){
        if(a.length != b.length){
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = sc.next();
        char[] customResult = customCharArray(input);
        char[] builtInResult = input.toCharArray();
        boolean equal = compareCharArrays(customResult, builtInResult);
        System.out.println("Custom Method Result:");
        for (char c : customResult) {
            System.out.print(c + " ");
        }

        System.out.println("Built-in toCharArray() Result:");
        for (char c : builtInResult) {
            System.out.print(c + " ");
        }

        System.out.println("Are both arrays equal? " + equal);
    }

}
