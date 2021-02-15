import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int count = 1;

        for (int i = 0; i < count; i++) {
            String destination = term.nextLine();
            if (!destination.equals("End")) {
                double budget = Double.parseDouble(term.nextLine());
                double money = Double.parseDouble(term.nextLine());
                if (money >= budget) {
                    System.out.printf("Going to %s!%n", destination);
                    count++;
                } else {
                    while (money < budget) {
                        money += money = Double.parseDouble(term.nextLine());
                        if (money >= budget) {
                            System.out.printf("Going to %s!%n", destination);
                            count++;
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
