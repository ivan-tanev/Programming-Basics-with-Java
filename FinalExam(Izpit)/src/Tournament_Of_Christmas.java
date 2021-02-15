import java.util.Scanner;

public class Tournament_Of_Christmas {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int tournamentDays = Integer.parseInt(term.nextLine());

        int countWins = 0;
        int countLoses = 0;
        int money = 0;
        double moneyForDay = 0;
        int dayWin = 0;
        int dayLose = 0;

        for (int i = 1; i <= tournamentDays; i++) {
            String sport = term.nextLine();
            int j = 0;
            while (!sport.equals("Finish")) {
                String winOrLose = term.nextLine();
                switch (winOrLose){
                    case "win":
                        money += 20;
                        countWins++;
                        break;
                    case "lose":
                        money += 0;
                        countLoses++;
                        break;
                }
                j++;
                sport = term.nextLine();
            }
            if (countLoses < countWins){
                moneyForDay = moneyForDay + money + (money * 0.1);
                dayWin++;
            } else if (countLoses > countWins){
                moneyForDay += money;
                dayLose++;
            }
            money = 0;
            countLoses = 0;
            countWins = 0;
        }
        if (dayWin > dayLose){
            moneyForDay = moneyForDay + (moneyForDay * 0.2);
            System.out.printf("You won the tournament! Total raised money: %.2f", moneyForDay);
        } else if (dayWin < dayLose){
            System.out.printf("You lost the tournament! Total raised money: %.2f", moneyForDay);
        }
    }
}
