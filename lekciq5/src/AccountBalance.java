import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int amountOfDeposits = Integer.parseInt(term.nextLine());
        int currentDeposit = 1;
        double sum = 0;

        while (currentDeposit <= amountOfDeposits){
            double income = Double.parseDouble(term.nextLine());
            if (income < 0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", income);
            sum = sum + income;
            currentDeposit++;
        }
        System.out.printf("Total: %.2f", sum);
    }
}
