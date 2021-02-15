import java.util.Scanner;

public class Sushi_Time {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        String sushiType = term.nextLine();
        String restaurantName = term.nextLine();
        int countOfDishes = Integer.parseInt(term.nextLine());
        char symbol = term.nextLine().charAt(0);
        double priceForDishes = 0;
        double priceTotal = 0;

        switch (sushiType){
            case "sashimi":
                switch (restaurantName){
                    case "Sushi Zone":
                        priceForDishes = countOfDishes * 4.99;
                        break;
                    case "Sushi Time":
                        priceForDishes = countOfDishes * 5.49;
                        break;
                    case "Sushi Bar":
                        priceForDishes = countOfDishes * 5.25;
                        break;
                    case "Asian Pub":
                        priceForDishes = countOfDishes * 4.50;
                        break;
                    default:
                        System.out.printf("%s is invalid restaurant!", restaurantName);
                        break;
                }
                break;
            case "maki":
                switch (restaurantName){
                    case "Sushi Zone":
                        priceForDishes = countOfDishes * 5.29;
                        break;
                    case "Sushi Time":
                        priceForDishes = countOfDishes * 4.69;
                        break;
                    case "Sushi Bar":
                        priceForDishes = countOfDishes * 5.55;
                        break;
                    case "Asian Pub":
                        priceForDishes = countOfDishes * 4.80;
                        break;
                    default:
                        System.out.printf("%s is invalid restaurant!", restaurantName);
                        break;
                }
                break;
            case "uramaki":
                switch (restaurantName){
                    case "Sushi Zone":
                        priceForDishes = countOfDishes * 5.99;
                        break;
                    case "Sushi Time":
                        priceForDishes = countOfDishes * 4.49;
                        break;
                    case "Sushi Bar":
                        priceForDishes = countOfDishes * 6.25;
                        break;
                    case "Asian Pub":
                        priceForDishes = countOfDishes * 5.50;
                        break;
                    default:
                        System.out.printf("%s is invalid restaurant!", restaurantName);
                        break;
                }
                break;
            case "temaki":
                switch (restaurantName){
                    case "Sushi Zone":
                        priceForDishes = countOfDishes * 4.29;
                        break;
                    case "Sushi Time":
                        priceForDishes = countOfDishes * 5.19;
                        break;
                    case "Sushi Bar":
                        priceForDishes = countOfDishes * 4.75;
                        break;
                    case "Asian Pub":
                        priceForDishes = countOfDishes * 5.50;
                        break;
                    default:
                        System.out.printf("%s is invalid restaurant!", restaurantName);
                        break;
                }
                break;
        }
        if (priceForDishes == 0) {

        } else {
            if (symbol == 'Y') {
                priceTotal = priceForDishes + (priceForDishes * 0.2);
            } else if (symbol == 'N') {
                priceTotal = priceForDishes;
            }
            System.out.printf("Total price: %.0f lv.", Math.ceil(priceTotal));
        }
    }
}
