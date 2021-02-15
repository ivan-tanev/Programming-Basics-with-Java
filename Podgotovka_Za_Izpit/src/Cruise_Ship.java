import java.util.Scanner;

public class Cruise_Ship {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        String sea = term.nextLine();
        String cabin = term.nextLine();
        int nightsCount = Integer.parseInt(term.nextLine());
        double price = 0;

        switch (cabin){
            case "standard cabin":
                if (sea.equals("Mediterranean")){
                    price = 27.50;
                } else if (sea.equals("Adriatic")){
                    price = 22.99;
                } else if (sea.equals("Aegean")){
                    price = 23.00;
                }
                break;
            case "cabin with balcony":
                if (sea.equals("Mediterranean")){
                    price = 30.20;
                } else if (sea.equals("Adriatic")){
                    price = 25.00;
                } else if (sea.equals("Aegean")){
                    price = 26.60;
                }
                break;
            case "apartment":
                if (sea.equals("Mediterranean")){
                    price = 40.50;
                } else if (sea.equals("Adriatic")){
                    price = 34.99;
                } else if (sea.equals("Aegean")){
                    price = 39.80;
                }
                break;
        }
        price = price * 4 * nightsCount;
        if (nightsCount > 7){
            price = price * 0.75;
        }

        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", sea, price);
    }
}
