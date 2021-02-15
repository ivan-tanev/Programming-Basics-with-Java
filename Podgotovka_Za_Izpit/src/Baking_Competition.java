import java.util.Scanner;

public class Baking_Competition {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int countOfBakers = Integer.parseInt(term.nextLine());
        double moneyGain = 0;
        int totalCounts = 0;

        for (int i = 0; i < countOfBakers; i++) {
            int cookiesCount = 0;
            int cakesCount = 0;
            int wafflesCount = 0;
            String bakerName = term.nextLine();
            String sweetType = term.nextLine();

            while (!sweetType.equals("Stop baking!")){
                int sweetsCount = Integer.parseInt(term.nextLine());
                totalCounts += sweetsCount;
                if (sweetType.equals("cookies")){
                    cookiesCount += sweetsCount;
                    moneyGain += sweetsCount * 1.50;
                } else if (sweetType.equals("cakes")){
                    cakesCount += sweetsCount;
                    moneyGain += sweetsCount * 7.80;
                } else if (sweetType.equals("waffles")){
                    wafflesCount += sweetsCount;
                    moneyGain += sweetsCount * 2.30;
                }
                sweetType = term.nextLine();
            }
            System.out.printf("%s baked %d cookies, %d cakes and %d waffles.%n", bakerName, cookiesCount, cakesCount, wafflesCount);
        }
        System.out.printf("All bakery sold: %d%n", totalCounts);
        System.out.printf("Total sum for charity: %.2f lv.", moneyGain);
    }
}
