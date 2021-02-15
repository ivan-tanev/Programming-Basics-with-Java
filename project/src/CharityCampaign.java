import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int days = Integer.parseInt(term.nextLine());
        int numberSweets = Integer.parseInt(term.nextLine());
        int numberCakes = Integer.parseInt(term.nextLine());
        int numberCorrugations = Integer.parseInt(term.nextLine());
        int numberPancakes = Integer.parseInt(term.nextLine());
        int cakeValue = 45;
        double corrugationValue = 5.80;
        double pancakesValue = 3.20;
        int cakesPerDay = numberCakes * cakeValue;
        double corrugationPerDay = numberCorrugations * corrugationValue;
        double pancakesPerDay = numberPancakes * pancakesValue;
        double sumPerDay = (cakesPerDay + corrugationPerDay + pancakesPerDay) * numberSweets;
        double sumForHoleCampaign = sumPerDay * days;
        double sumAfterAllCosts = sumForHoleCampaign - (sumForHoleCampaign * 1 / 8);
        System.out.printf("%.2f",sumAfterAllCosts);
    }
}
