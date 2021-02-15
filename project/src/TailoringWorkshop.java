import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        double l = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());

        double area1 = a * (l + 2 * 0.30) * (w + 2 * 0.30);
        double area2 = a * (l / 2) * (l / 2);

        double USD = area1 * 7 + area2 * 9;
        double BGN = USD * 1.85;

        System.out.printf("%.2f USD%n", USD);
        System.out.printf("%.2f BGN", BGN);


    }
}