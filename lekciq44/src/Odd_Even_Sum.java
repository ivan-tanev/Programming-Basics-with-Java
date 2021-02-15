import java.util.Scanner;

public class Odd_Even_Sum {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int n = Integer.parseInt(term.nextLine());
        int odd = 0;
        int even = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0){
                int evenNumber = Integer.parseInt(term.nextLine());
                even = even + evenNumber;
            } else {
                int oddNumber = Integer.parseInt(term.nextLine());
                odd = odd + oddNumber;
            }
        }
        if (even == odd){
            System.out.println("Yes");
            System.out.printf("Sum = %d", even);
        } else {
            System.out.println("No");
            int diff = Math.abs(even - odd);
            System.out.printf("Diff = %d", diff);
        }
    }
}
