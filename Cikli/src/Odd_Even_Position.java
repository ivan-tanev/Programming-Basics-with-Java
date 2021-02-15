import java.util.Scanner;

public class Odd_Even_Position {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int n = Integer.parseInt(term.nextLine());
        double oddSum = 0;
        double evenSum = 0;
        double minOdd = Integer.MAX_VALUE;
        double maxOdd = Integer.MIN_VALUE;
        double minEven = Integer.MAX_VALUE;
        double maxEven = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(term.nextLine());
            if (i % 2 == 1){
                oddSum = oddSum + number;
                if (number < minOdd) {
                    minOdd = number;
                }
                if (number > maxOdd) {
                    maxOdd = number;
                }
            } else {
                evenSum = evenSum + number;
                if (number < minEven) {
                    minEven = number;
                }
                if (number > maxEven) {
                    maxEven = number;
                }
            }
        }
        if (n == 0) {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else if ((minEven == Integer.MAX_VALUE) && (maxEven == Integer.MIN_VALUE)){
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.printf("OddMin=%.2f,%n", minOdd);
            System.out.printf("OddMax=%.2f,%n", maxOdd);
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else if ((minOdd == Integer.MAX_VALUE) && (maxOdd == Integer.MIN_VALUE)){
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.printf("EvenMin=%.2f,%n", minEven);
            System.out.printf("EvenMax=%.2f", maxEven);
        } else {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.printf("OddMin=%.2f,%n", minOdd);
            System.out.printf("OddMax=%.2f,%n", maxOdd);
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.printf("EvenMin=%.2f,%n", minEven);
            System.out.printf("EvenMax=%.2f", maxEven);
        }
    }
}
