import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        double budget = Double.parseDouble(term.nextLine());
        int countStatists = Integer.parseInt(term.nextLine());
        double pricePerStatist = Double.parseDouble(term.nextLine());
        double decorPrice = 0.1 * budget;
        double clothesPrice = countStatists * pricePerStatist;
        if (countStatists > 150){
            clothesPrice = clothesPrice - (clothesPrice * 0.1);      // 0.9 * clothesPrice
        }
        double total = decorPrice + clothesPrice;
        if (total > budget){
            System.out.println("Not enough money!");
            double needMoney = total - budget;
            System.out.printf("Wingard needs %.2f leva more.", needMoney);
        } else {
            System.out.println("Action!");
            double leftMoney = budget - total;
            System.out.printf("Wingard starts filming with %.2f leva left.", leftMoney);
        }
    }
}
