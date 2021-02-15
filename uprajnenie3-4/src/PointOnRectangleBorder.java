import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        double x1 = Double.parseDouble(term.nextLine());
        double y1 = Double.parseDouble(term.nextLine());
        double x2 = Double.parseDouble(term.nextLine());
        double y2 = Double.parseDouble(term.nextLine());
        double x = Double.parseDouble(term.nextLine());
        double y = Double.parseDouble(term.nextLine());

        boolean check1 = (x == x1 || x == x2) && (y >= y1 && y <= y2);
        boolean check2 = (y == y1 || y == y2) && (x >= x1 && x <= x2);

        if (check1 || check2){
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}