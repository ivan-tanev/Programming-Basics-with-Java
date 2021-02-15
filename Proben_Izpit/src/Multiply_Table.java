import java.util.Scanner;

public class Multiply_Table {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        String number = term.nextLine();
        int num3 = Character.getNumericValue(number.charAt(2));
        int num2 = Character.getNumericValue(number.charAt(1));
        int num1 = Character.getNumericValue(number.charAt(0));
        int sum = 0;

        for (int i = 1; i <= num3; i++) {
            for (int j = 1; j <= num2; j++) {
                for (int k = 1; k <= num1; k++) {
                    sum = i * j * k;
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, sum);
                }
            }
        }
    }
}
