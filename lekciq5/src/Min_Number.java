import java.util.Scanner;

public class Min_Number {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int countOf_N = Integer.parseInt(term.nextLine());
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= countOf_N; i++) {
            int n = Integer.parseInt(term.nextLine());
            if (n < min && n != 0){
                min = n;
            }
        }
        System.out.println(min);
    }
}
