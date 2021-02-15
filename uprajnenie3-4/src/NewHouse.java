import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        String flowerType = term.nextLine();
        int flowerCount = Integer.parseInt(term.nextLine());
        int budget = Integer.parseInt(term.nextLine());
         double singlePrice = 0;
         switch (flowerType){
             case "Roses":
                 singlePrice = 5;
                 break;
             case "Dahlias":
                 singlePrice = 3.80;
                 break;
             case "Tulips":
                 singlePrice = 2.80;
                 break;
             case "Narcissus":
                 singlePrice = 3;
                 break;
             case "Gladiolus":
                 singlePrice = 2.50;
                 break;
         }
         double totalPrice = flowerCount * singlePrice;

         if (flowerCount > 80 && flowerType.equals("Roses")){
             totalPrice = totalPrice - 0.1 * totalPrice;
         } else if (flowerCount > 90 && flowerType.equals("Dahlias")){
             totalPrice = totalPrice - 0.15 * totalPrice;
         } else if (flowerCount > 80 && flowerType.equals("Tulips")){
             totalPrice = totalPrice - 0.15 * totalPrice;
         } else if (flowerCount < 120 && flowerType.equals("Narcissus")){
             totalPrice = totalPrice + 0.15 * totalPrice;
         } else if (flowerCount < 80 && flowerType.equals("Gladiolus")){
             totalPrice = totalPrice + 0.20 * totalPrice;
         }

         if (budget >= totalPrice){
             double leftMoney = budget - totalPrice;
             System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, leftMoney);
         } else {
             double needMoney = totalPrice - budget;
             System.out.printf("Not enough money, you need %.2f leva more.", needMoney);
         }
    }
}
