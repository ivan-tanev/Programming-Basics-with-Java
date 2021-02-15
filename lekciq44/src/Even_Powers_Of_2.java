import java.util.Scanner;

public class Even_Powers_Of_2 {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int n = Integer.parseInt(term.nextLine());
        int num = 1;

        for (int i = 0; i <= n; i += 2) {
                System.out.println(num);
                num = num * 2 * 2;
        }
    }
}
