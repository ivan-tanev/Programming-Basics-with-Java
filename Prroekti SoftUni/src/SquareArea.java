import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int a = Integer.parseInt(term.nextLine());
        int area = a * a;
        System.out.println(area);
    }
}
