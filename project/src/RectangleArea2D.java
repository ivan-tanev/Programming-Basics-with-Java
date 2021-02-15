import java.util.Scanner;

public class RectangleArea2D {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        //1. read input -> x1, y1, x2, y2
        //2. calculate width = y1


        double x1 = Double.parseDouble(terminal.nextLine());
        double y1 = Double.parseDouble(terminal.nextLine());
        double x2 = Double.parseDouble(terminal.nextLine());
        double y2 = Double.parseDouble(terminal.nextLine());

        double width = Math.abs(y1 - y2);
        double length = Math.abs(x1 - x2);
        double area = width * length;
        double perimeter = 2 * (width + length);

        System.out.printf("%.2f%n",area);
        System.out.printf("%.2f",perimeter);
    }
}
