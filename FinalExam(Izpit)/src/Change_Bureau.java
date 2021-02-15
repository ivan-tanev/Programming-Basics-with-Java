import java.util.Scanner;

public class Change_Bureau {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int bitCoins = Integer.parseInt(term.nextLine());
        double chiniesUan = Double.parseDouble(term.nextLine());
        double service = Double.parseDouble(term.nextLine());

        double bitCoinsInLev = bitCoins * 1.0 * 1168;
        double chiniesUanInDolars = chiniesUan * 0.15;
        double dolarsInLev = chiniesUanInDolars * 1.76;
        double sumInLev = bitCoinsInLev + dolarsInLev;
        double sumInEuro = sumInLev / 1.95;
        double finalCash = sumInEuro - (sumInEuro * (0.01 * service));
        System.out.printf("%.2f", finalCash);
    }
}
