import java.util.Scanner;

public class Darts_Tournament {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int startingPoints = Integer.parseInt(term.nextLine());
        boolean wonWithBullsEye = false;
        int moves = 0;

        while (startingPoints > 0){
            String sector = term.nextLine();
            moves++;
            if (sector.equals("bullseye")){
                wonWithBullsEye = true;
                break;
            }

            int currentPoints = Integer.parseInt(term.nextLine());

            switch (sector){
                case "number section":
                    startingPoints -= currentPoints * 1;
                    break;
                case "double ring":
                    startingPoints -= currentPoints * 2;
                    break;
                case "triple ring":
                    startingPoints -= currentPoints * 3;
                    break;
            }
            if (startingPoints < 0){
                break;
            }
        }
        if (wonWithBullsEye){
            System.out.printf("Congratulations! You won the game with a bullseye in %d moves!", moves);
        } else if (startingPoints == 0){
            System.out.printf("Congratulations! You won the game in %d moves!", moves);
        } else {
            System.out.printf("Sorry, you lost. Score difference: %d.", Math.abs(startingPoints));
        }
    }
}
