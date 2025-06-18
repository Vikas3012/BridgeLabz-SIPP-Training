import java.util.Scanner;

public class WordLengthAnalyzer {
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
        String[] words = new String[space +  1];
        StringBuilder word = new StringBuilder();
        int index = 0;
        for (int i = 0; i < length; i++) {
            char ch = line.charAt(i);
            if(ch == ' '){
                words[index++] = word.toString();
                word.setLength(0);
            }else{
                word.append(ch);
            }
        }
        words[index] = word.toString();
        return words;
    }
    public static String[][] buildWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(customLength(words[i]));
        }
        return table;
    }
    public static int[] findShortestAndLongest(String[][] table) {
        int shortIdx = 0;
        int longIdx = 0;
        int min = Integer.parseInt(table[0][1]);
        int max = Integer.parseInt(table[0][1]);
        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if(len < min){
                min = len;
                shortIdx = i;
            }
            if(len > max){
                max = len;
                longIdx = i;
            }
        }
        return new int[]{shortIdx, longIdx};

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = customSplit(input);
        String[][] table = buildWordLengthTable(words);
        int[] result = findShortestAndLongest(table);

        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------------");
        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + Integer.parseInt(row[1]));
        }

        System.out.println("\nShortest Word: " + table[result[0]][0]);
        System.out.println("Longest Word: " + table[result[1]][0]);
    }

}
