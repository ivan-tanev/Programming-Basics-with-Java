import java.util.Scanner;

public class Summer_Shopping {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int budget = Integer.parseInt(term.nextLine());
        double beachTowel = Double.parseDouble(term.nextLine());
        int discount = Integer.parseInt(term.nextLine());

        double umbrellaPrice = beachTowel * 2 / 3;
        double flipFlops = umbrellaPrice * 0.75;
        double beachBagPrice = (flipFlops + beachTowel) * 1 / 3;

        double totalPrice = beachTowel + umbrellaPrice + flipFlops + beachBagPrice;
        double discountPercent = (discount * 1.0) / 100;
        double finalPrice = totalPrice - (totalPrice * discountPercent);

        if (finalPrice > budget){
            double moneyNeed = finalPrice - budget;
            System.out.printf("Annie's sum is %.2f lv. She needs %.2f lv. more.", finalPrice, moneyNeed);
        } else {
            double moneyLeft = budget - finalPrice;
            System.out.printf("Annie's sum is %.2f lv. She has %.2f lv. left.", finalPrice, moneyLeft);
        }
    }
}
