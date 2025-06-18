import java.util.Scanner;

public class CustomSplitComparison {
    public static int customLength(String line){
        int count = 0;
        try {
            while(true){
                line.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static String[] customSplit(String line){
        int length = customLength(line);
        int spaces = 0;
        for (int i = 0; i < length; i++) {
            if(line.charAt(i) == ' '){
                spaces++;
            }
        }
        String[] split = new String[spaces + 1];
        StringBuilder word = new StringBuilder();
        int index = 0;
        for (int i = 0; i < length; i++) {
            char ch = line.charAt(i);
            if(ch == ' '){
                split[index++] = word.toString();
                word.setLength(0);
            }else{
                word.append(ch);
            }
        }
        split[index] = word.toString();
        return split;
    }
        public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] customResult = customSplit(input);
        String[] builtInResult = input.split(" ");
                System.out.println("Custom Split Result:");
        for (String word : customResult) {
            System.out.println(word);
        }

        System.out.println("Built-in Split Result:");
        for (String word : builtInResult) {
            System.out.println(word);
        }

        boolean isSame = compareStringArrays(customResult, builtInResult);
        System.out.println("\nAre both split results the same? " + isSame);
    }
}
