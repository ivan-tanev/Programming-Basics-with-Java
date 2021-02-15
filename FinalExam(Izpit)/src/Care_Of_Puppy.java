import java.util.Scanner;

public class Care_Of_Puppy {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int dogFood = Integer.parseInt(term.nextLine());
        String gramsFood = term.nextLine();
        int dogFoodInGrams = dogFood * 1000;
        double gramsFoodPerDay = 0;
        double leftover = 0;
        double needed = 0;

        int i = 0;
        while (!gramsFood.equals("Adopted")) {
            gramsFoodPerDay += Double.parseDouble(gramsFood);
            i++;
            gramsFood = term.nextLine();
        }
        if (dogFoodInGrams >= gramsFoodPerDay){
            leftover = dogFoodInGrams - gramsFoodPerDay;
            System.out.printf("Food is enough! Leftovers: %.0f grams.", leftover);
        } else {
            needed = gramsFoodPerDay - dogFoodInGrams;
            System.out.printf("Food is not enough. You need %.0f grams more.", needed);
        }
    }
}
