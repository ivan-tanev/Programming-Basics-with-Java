import java.util.Scanner;

public class Bachelor_Party {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int moneyForMusicants = Integer.parseInt(term.nextLine());
        String people = term.nextLine();
        double moneyFromPeople = 0;
        double moneyLeft = 0;

        int i = 0;
        while (!people.equals("The restaurant is full")) {
            if (Integer.parseInt(people) >= 5){
                moneyFromPeople += (Integer.parseInt(people) * 70);
            } else {
                moneyFromPeople += (Integer.parseInt(people) * 100);
            }
            i += Integer.parseInt(people);
            people = term.nextLine();
        }
        moneyLeft = moneyFromPeople - moneyForMusicants;
        if (moneyLeft < 0){
            System.out.printf("You have %d guests and %.0f leva income, but no singer.", i, moneyFromPeople);
        } else {
            System.out.printf("You have %d guests and %.0f leva left.", i, moneyLeft);
        }
    }
}
