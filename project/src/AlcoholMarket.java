import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        //1. Read input ->
        //2. Cenata na rakiqta = uiski / 2
        //3. Cenata na vinoto = rakiq - 0.4 * rakiq   =>     0.6 * rakiq
        //4. Cena na birata = rakiq - 0.8 * rakiq    => 0.2 * rakiq
        //5. kraina cena = (uiski * kolichestvo) + (rakiq * kolichestvo) + (bira * kolichestvo) + (vino * kolichestvo)
        //6. printirane

        double whiskeyprice = Double.parseDouble(term.nextLine());
        double beerLiters = Double.parseDouble(term.nextLine());
        double wineLiters = Double.parseDouble(term.nextLine());
        double rakiaLiters = Double.parseDouble(term.nextLine());
        double whiskeyLiters = Double.parseDouble(term.nextLine());

        double rakiaPrice = whiskeyprice / 2;
        double winePrice = rakiaPrice - 0.4 * rakiaPrice;           //0.6 * rkiaPrice
        double beerPrice = rakiaPrice - 0.8 * rakiaPrice;           //0.2 * rakiaPrice
        double totalPrice = (whiskeyprice * whiskeyLiters) + (winePrice * wineLiters) + (beerPrice * beerLiters) + (rakiaPrice * rakiaLiters);

        System.out.printf("%.2f",totalPrice);
    }
}
