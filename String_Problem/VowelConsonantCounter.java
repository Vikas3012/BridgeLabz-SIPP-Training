import java.util.Scanner;

public class VowelConsonantCounter {
    public static String checkCharType(char ch) {
        if(ch >= 'A' && ch<= 'Z'){
            ch = (char)(ch - 32);
        }
        if(ch >= 'a' && ch <= 'z'){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                return "Vowel";
            }else{
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static int[]countVowelsConsonants(String line){
        int[] count = {0, 0};
        for (int i = 0; i < line.length(); i++) {
            String check = checkCharType(line.charAt(i));
            if(check.equals("Vowel")) count[0]++;
            if(check.equals("Consonant"))count[1]++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        int[] counts = countVowelsConsonants(input);

        System.out.println("Vowel Count: " + counts[0]);
        System.out.println("Consonant Count: " + counts[1]);
    }
}
