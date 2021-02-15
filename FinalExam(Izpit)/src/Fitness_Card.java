import java.util.Scanner;

public class Fitness_Card {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        double money = Double.parseDouble(term.nextLine());
        char gender = term.nextLine().charAt(0);
        int age = Integer.parseInt(term.nextLine());
        String sport = term.nextLine();

        double pass = 0.0;
        double moneyNeeded = 0.0;

        if (age > 19) {
            switch (gender) {
                case 'm':
                    switch (sport) {
                        case "Gym":
                            pass = money - 42;
                            break;
                        case "Boxing":
                            pass = money - 41;
                            break;
                        case "Yoga":
                            pass = money - 45;
                            break;
                        case "Zumba":
                            pass = money - 34;
                            break;
                        case "Dances":
                            pass = money - 51;
                            break;
                        case "Pilates":
                            pass = money - 39;
                            break;
                    }
                    break;
                case 'f':
                    switch (sport) {
                        case "Gym":
                            pass = money - 35;
                            break;
                        case "Boxing":
                            pass = money - 37;
                            break;
                        case "Yoga":
                            pass = money - 42;
                            break;
                        case "Zumba":
                            pass = money - 31;
                            break;
                        case "Dances":
                            pass = money - 53;
                            break;
                        case "Pilates":
                            pass = money - 37;
                            break;
                    }
                    break;
            }
        } else {
            switch (gender) {
                case 'm':
                    switch (sport) {
                        case "Gym":
                            pass = money - (42 * 0.8);
                            break;
                        case "Boxing":
                            pass = money - (41 * 0.8);
                            break;
                        case "Yoga":
                            pass = money - (45 * 0.8);
                            break;
                        case "Zumba":
                            pass = money - (34 * 0.8);
                            break;
                        case "Dances":
                            pass = money - (51 * 0.8);
                            break;
                        case "Pilates":
                            pass = money - (39 * 0.8);
                            break;
                    }
                    break;
                case 'f':
                    switch (sport) {
                        case "Gym":
                            pass = money - (35 * 0.8);
                            break;
                        case "Boxing":
                            pass = money - (37 * 0.8);
                            break;
                        case "Yoga":
                            pass = money - (42 * 0.8);
                            break;
                        case "Zumba":
                            pass = money - (31 * 0.8);
                            break;
                        case "Dances":
                            pass = money - (53 * 0.8);
                            break;
                        case "Pilates":
                            pass = money - (37 * 0.8);
                            break;
                    }
                    break;
            }
        }
        if (money >= pass && pass >= 0){
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(pass));
        }
    }
}
