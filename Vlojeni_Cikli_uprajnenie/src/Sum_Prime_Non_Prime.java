import java.util.Scanner;

public class Sum_Prime_Non_Prime {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int primeNumbersSum = 0;
        int nonPrimeNumbersSum = 0;

        while (true) {
            String input = term.nextLine();
            if (input.equals("stop")) {
                break;
            }
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
            } else {

                boolean isPrime = true;

                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeNumbersSum += number;
                } else {
                    nonPrimeNumbersSum += number;
                }
            }
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeNumbersSum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeNumbersSum);
    }
}
