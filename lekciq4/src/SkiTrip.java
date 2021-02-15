import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int days = Integer.parseInt(term.nextLine());

        String room = term.nextLine();
        String grade = term.nextLine();
        double price = 0;
        double finalPrice = 0;
        double priceWithGrade = 0;
        int nights = days - 1;

        switch (room){
            case "room for one person":
                    nights = days - 1;
                    finalPrice = nights * 18.00;
                break;
            case "apartment":
                if (days < 10){
                    nights = days - 1;
                    price = nights * 25.00;
                    finalPrice = price - (price * 0.3);
                } else if (10 < days && days < 15){
                    nights = days - 1;
                    price = nights * 25.00;
                    finalPrice = price - (price * 0.35);
                } else if (days > 15){
                    nights = days - 1;
                    price = nights * 25.00;
                    finalPrice = price - (price * 0.5);
                }
                break;
            case "president apartment":
                if (days < 10){
                    nights = days - 1;
                    price = nights * 35.00;
                    finalPrice = price - (price * 0.1);
                } else if (10 < days && days < 15){
                    nights = days - 1;
                    price = nights * 35.00;
                    finalPrice = price - (price * 0.15);
                } else if (days >= 15){
                    nights = days - 1;
                    price = nights * 35.00;
                    finalPrice = price - (price * 0.2);
                }
                break;
        }
        switch (grade){
            case "positive":
                priceWithGrade = finalPrice + (finalPrice * 0.25);
                System.out.printf("%.2f", priceWithGrade);
                break;
            case "negative":
                priceWithGrade = finalPrice - (finalPrice * 0.1);
                System.out.printf("%.2f", priceWithGrade);
                break;
        }
    }
}
