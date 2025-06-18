import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice(){
        double random = Math.random();
        if(random < 0.34) 
            return "rock";
        else if(random < 0.67)
            return "paper";
        else
            return "scissors";

    }
    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";

        switch (user) {
            case "rock":
                return (computer.equals("scissors")) ? "User" : "Computer";
            case "paper":
                return (computer.equals("rock")) ? "User" : "Computer";
            case "scissors":
                return (computer.equals("paper")) ? "User" : "Computer";
            default:
                return "Invalid";
        }
    }
    public static String[][] calculateStats(int userWins, int compWins, int draws, int games){
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[1][0] = "Computer";
        stats[0][1] = String.valueOf(userWins);
        stats[1][1] = String.valueOf(compWins);
        stats[0][2] = String.format("%.2f%%", (userWins * 100.0) / games);
        stats[1][2] = String.format("%.2f%%", (compWins * 100.0) / games);
        return stats;
    }
     public static void displayResults(String[][] gameResults, String[][] stats, int draws) {
        System.out.println("\nGame\tUser\tComputer\tWinner");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t" +
                    gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nTotal Draws: " + draws);
        System.out.println("\nStats Summary:");
        System.out.println("Player\tWins\tWin Percentage");
        System.out.println("--------------------------------");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of games: ");
        int games = sc.nextInt();
        sc.nextLine();
        String[][] gameResults = new String[games][3];
        int userWins = 0, compWins = 0, draws = 0;
        for (int i = 0; i < games; i++) {
            System.out.print("\nGame " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();
            String compChoice = getComputerChoice();
            String winner = getWinner(userChoice, compChoice);

            gameResults[i][0] = userChoice;
            gameResults[i][1] = compChoice;
            gameResults[i][2] = winner;

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;
        }

        String[][] stats = calculateStats(userWins, compWins, draws, games);
        displayResults(gameResults, stats, draws);
    }
}
