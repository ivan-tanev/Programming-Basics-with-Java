import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner term = new Scanner (System.in);
        double Meters = Double.parseDouble(term.nextLine());
        double oneMeter = 7.61;
        double holeYard = Meters * oneMeter;
        double price = holeYard - (holeYard * 0.18);
        double discount = holeYard - price;
        System.out.printf("The final price is: %.2f lv.", price);
        System.out.printf("%nThe discount is: %.2f lv.", discount);
    }
}
