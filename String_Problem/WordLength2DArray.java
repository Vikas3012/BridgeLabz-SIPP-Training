	// •	Take a sentence as input,
	// •	Split it into words (without using split()),
	// •	Calculate lengths (without using length()),
	// •	Store them in a 2D String[][] array, and
	// •	Display in tabular format.

import java.util.Scanner;

public class WordLength2DArray {
    public static int customLength(String line){
        int count = 0;
        try{
            while(true){
                line.charAt(count);
                count++;
            }
        }catch(Exception e){
            return count;
        }
    }
    public static String[] customSplit(String line){
        int length = customLength(line);
        int space = 0;
        for (int i = 0; i < length; i++) {
            if(line.charAt(i) == ' '){
                space++;
            }
        }
        String[] split = new String[space +  1];
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
    public static String[][] buildWordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(customLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] words = customSplit(input);
        String[][] table = buildWordLengthTable(words);

        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + Integer.parseInt(table[i][1]));
        }
    

    }
}
