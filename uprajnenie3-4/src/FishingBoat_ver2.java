import java.util.Scanner;

public class FishingBoat_ver2 {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int budget = Integer.parseInt(term.nextLine());
        String season = term.nextLine();
        int fishers = Integer.parseInt(term.nextLine());
        double price = 0;
        double sum = 0;

        switch (season) {
            case "Spring":
                price = 3000.0;
                break;
            case "Summer":
            case "Autumn":
                price = 4200.0;
                break;
            case "Winter":
                price = 2600.0;
                break;
        }

        if (fishers <= 6) {
            sum = price - (0.1 * price);
        } else if (fishers > 7 && fishers <= 11) {
            sum = price - (0.15 * price);
        } else if (fishers > 12) {
            sum = price - (0.25 * price);
        }

        if (fishers % 2 == 0 && !(season.equals("Autumn"))){
            sum = sum * 0.95;}
        double result = (budget - sum);
        if (result >= 0) {
            System.out.printf("Yes! You have %.2f leva left.", result);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(result));
        }
    }
}
