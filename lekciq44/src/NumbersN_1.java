import java.util.Scanner;

public class NumbersN_1 {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int n = Integer.parseInt(term.nextLine());
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
