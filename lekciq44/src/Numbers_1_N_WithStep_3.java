import java.util.Scanner;

public class Numbers_1_N_WithStep_3 {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int n = Integer.parseInt(term.nextLine());

        for (int i = 1; i <= n; i = i + 3) {
            System.out.println(i);
        }
    }
}
