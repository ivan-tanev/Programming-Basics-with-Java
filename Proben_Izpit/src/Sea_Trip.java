import java.util.Scanner;

public class Sea_Trip {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        double moneyForFood = Double.parseDouble(term.nextLine());
        double moneyForSouvenirs = Double.parseDouble(term.nextLine());
        double moneyForHotel = Double.parseDouble(term.nextLine());

        double fuelLiters = (210 * 1.0 * 2) / 100 * 7;
        double priceForFuel = fuelLiters * 1.85;

        double moneyForFoodAndSouvenirs = moneyForFood * 3 + moneyForSouvenirs * 3;
        double firstDayAtHotel = moneyForHotel * 0.9;
        double secondDayAtHotel = moneyForHotel * 0.85;
        double thirdDayAtHotel = moneyForHotel * 0.80;

        double sum = priceForFuel + moneyForFoodAndSouvenirs + firstDayAtHotel + secondDayAtHotel + thirdDayAtHotel;
        System.out.printf("Money needed: %.2f", sum);
    }
}
