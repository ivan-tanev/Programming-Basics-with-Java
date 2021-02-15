import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        double inch = Double.parseDouble(term.nextLine());
        double centimetres = inch * 2.54;
        System.out.println(centimetres);
    }
}
