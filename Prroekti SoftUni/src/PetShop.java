import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int dogs = Integer.parseInt(term.nextLine());
        int otherAnimals = Integer.parseInt(term.nextLine());
        double dogFood = 2.50;
        int otherAnimalsFood = 4;
        double totalDogFood = dogs * dogFood;
        int totalOtherAnimalsFood = otherAnimals * otherAnimalsFood;
        double total = totalDogFood + totalOtherAnimalsFood;
        System.out.printf("%.2f lv.",total);
    }
}
