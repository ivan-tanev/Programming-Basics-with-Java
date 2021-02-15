import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int degrees = Integer.parseInt(term.nextLine());
        String day = term.nextLine();

        switch (day){
            case "Morning":
                if (10 <= degrees && degrees <= 18){
                    System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", degrees);
                } else if (18 < degrees && degrees <= 24){
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                } else if (degrees >= 25){
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degrees);
                }
                break;
            case "Afternoon":
                if (10 <= degrees && degrees <= 18){
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                } else if (18 < degrees && degrees <= 24){
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degrees);
                } else if (degrees >= 25){
                    System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", degrees);
                }
                break;
            case "Evening":
                if (10 <= degrees && degrees <= 18){
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                } else if (18 < degrees && degrees <= 24){
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                } else if (degrees >= 25){
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                }
                break;
        }
    }
}
