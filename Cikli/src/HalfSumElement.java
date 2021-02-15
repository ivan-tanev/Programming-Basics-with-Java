import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int n = Integer.parseInt(term.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int number = 0; number < n ; number++) {
            int value = Integer.parseInt(term.nextLine());
            sum = sum + value;
            if (value > max){
                max = value;
            }
        }
        int sumOthers = sum - max;

        if (max == sumOthers){
            System.out.println("Yes");
            System.out.println("Sum = " + sumOthers);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(max - sumOthers));
        }
    }
}
