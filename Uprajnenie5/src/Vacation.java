import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        double needMoney = Double.parseDouble(term.nextLine());
        double money = Double.parseDouble(term.nextLine());
        int countAllDays = 0;
        int countSpendDays = 0;

        while (money < needMoney){
            String action = term.nextLine();
            double price = Double.parseDouble(term.nextLine());
            countAllDays++;
            if (action.equals("save")){
                money += price;
                countSpendDays = 0;
            } else if (action.equals("spend")){
                countSpendDays++;
                money -= price;
                if (money <= 0){
                    money = 0;
                }
            }
            if (countSpendDays == 5){
                System.out.println("You can't save the money.");
                System.out.println(countAllDays);
                break;
            }
        }
        if (money >= needMoney){
            System.out.printf("You saved the money for %d days.", countAllDays);
        }
    }
}
