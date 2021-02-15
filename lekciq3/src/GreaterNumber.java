import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int a = Integer.parseInt(term.nextLine());
        int b = Integer.parseInt(term.nextLine());
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
