import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        String ticket = term.nextLine();
        int r = Integer.parseInt(term.nextLine());
        int c = Integer.parseInt(term.nextLine());
        double income = 0;

        switch (ticket){
            case "Premiere":
                income = r * c * 12.00;
                System.out.printf("%.2f leva", income);
                break;
            case "Normal":
                income = r * c * 7.50;
                System.out.printf("%.2f leva", income);
                break;
            case "Discount":
                income = r * c * 5.00;
                System.out.printf("%.2f leva", income);
                break;
        }
    }
}
