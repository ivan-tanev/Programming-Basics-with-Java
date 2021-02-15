import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        double budget = Double.parseDouble(term.nextLine());
        String season = term.nextLine();
        double priceForHoliday = 0;

        if (budget <= 100){
            switch (season){
                case "summer":
                    priceForHoliday = budget * 0.30;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Camp - %.2f", priceForHoliday);
                    break;
                case "winter":
                    priceForHoliday = budget * 0.70;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Hotel - %.2f", priceForHoliday);
                    break;
            }
        } else if (budget >100 && budget <=1000){
            switch (season){
                case "summer":
                    priceForHoliday = budget * 0.40;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Camp - %.2f", priceForHoliday);
                    break;
                case "winter":
                    priceForHoliday = budget * 0.80;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Hotel - %.2f", priceForHoliday);
                    break;
            }
        } else if (budget > 1000){
            switch (season){
                case "summer":
                case "winter":
                    priceForHoliday = budget * 0.90;
                    System.out.println("Somewhere in Europe");
                    System.out.printf("Hotel - %.2f", priceForHoliday);
            }
        }
    }
}
