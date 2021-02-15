import java.util.Scanner;

public class Cruise_Games {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        String playerName = term.nextLine();
        int playedGames = Integer.parseInt(term.nextLine());

        int volleyballCounter = 0;
        double volleyballPoints = 0.0;

        int tennisCounter = 0;
        double tennisPoints = 0.0;

        int badmintonCounter = 0;
        double badmintonPoints = 0.0;

        for (int i = 0; i < playedGames; i++) {
            String game = term.nextLine();
            int points = Integer.parseInt(term.nextLine());

            switch (game){
                case "volleyball":
                    volleyballCounter++;
                    volleyballPoints += points * 1.07;
                    break;
                case "tennis":
                    tennisCounter++;
                    tennisPoints += points * 1.05;
                    break;
                case "badminton":
                    badmintonCounter++;
                    badmintonPoints += points * 1.02;
                    break;
            }
        }
        double volleyballAvg = volleyballPoints / volleyballCounter;
        double tennisAvg = tennisPoints / tennisCounter;
        double badmintonAvg = badmintonPoints / badmintonCounter;

        double sum = volleyballPoints + tennisPoints + badmintonPoints;

        if (volleyballAvg >= 75 && tennisAvg >= 75 && badmintonAvg >= 75){
            System.out.printf("Congratulations, %s! You won the cruise games with %.0f points.", playerName, Math.floor(sum));
        } else {
            System.out.printf("Sorry, %s, you lost. Your points are only %.0f.", playerName, Math.floor(sum));
        }
    }
}
