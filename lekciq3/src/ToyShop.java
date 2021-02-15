import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        double priceTrip = Double.parseDouble(term.nextLine());
        int puzzles = Integer.parseInt(term.nextLine());
        int talkingDolls = Integer.parseInt(term.nextLine());
        int teddyBears = Integer.parseInt(term.nextLine());
        int minions = Integer.parseInt(term.nextLine());
        int trucks = Integer.parseInt(term.nextLine());
        double sumToys = puzzles * 2.60 + talkingDolls * 3 + teddyBears * 4.10 + minions * 8.20 + trucks * 2;
        int countToys = puzzles + talkingDolls + teddyBears + minions + trucks;
        if (countToys >= 50){
            sumToys = sumToys - (sumToys * 0.25);
            }
        double finalMoney = sumToys * 0.9;
        if (priceTrip <= finalMoney){
            double neededMoney = finalMoney - priceTrip;
            System.out.printf("Yes! %.2f lv left.", neededMoney);
        } else {
            double neededMoney = priceTrip - finalMoney;
            System.out.printf("Not enough money! %.2f lv needed.", neededMoney);
        }
        }
    }
