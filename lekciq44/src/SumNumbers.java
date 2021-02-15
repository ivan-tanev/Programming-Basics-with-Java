import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int sum = 0;
        int n = Integer.parseInt(term.nextLine());

        for (int i = 0; i < n ; i++){
            int currentNumber = Integer.parseInt(term.nextLine());
            sum = sum + currentNumber;
        }
        System.out.println(sum);
    }
}
