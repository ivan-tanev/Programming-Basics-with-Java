import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        double incomes = Double.parseDouble(term.nextLine());
        int months = Integer.parseInt(term.nextLine());
        double personalNeeds = Double.parseDouble(term.nextLine());

        double additionalCosts = incomes * 0.3;
        double savedMoney = incomes - additionalCosts - personalNeeds;
        double percentSavedMoney = savedMoney / incomes * 100;

        double totalSavedMoney = savedMoney * months;
        System.out.printf("She can save %.2f%%%n", percentSavedMoney);
        System.out.printf("%.2f", totalSavedMoney);
    }
}
