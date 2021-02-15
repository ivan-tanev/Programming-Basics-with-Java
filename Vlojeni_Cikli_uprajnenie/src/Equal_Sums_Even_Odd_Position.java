import java.lang.reflect.InaccessibleObjectException;
import java.util.Scanner;

public class Equal_Sums_Even_Odd_Position {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int start = Integer.parseInt(term.nextLine());
        int end = Integer.parseInt(term.nextLine());

        for (int i = start; i <= end; i++) {
            int evenDigitSum = 0;
            int oddDigitSum =0;

            boolean isEvenPosition = true;
            int currentNumber = i;
            while (currentNumber > 0){
                int lastDigit = currentNumber % 10;

                if (isEvenPosition){
                    evenDigitSum += lastDigit;
                    isEvenPosition = false;
                } else {
                    oddDigitSum += lastDigit;
                    isEvenPosition = true;
                }
                currentNumber /= 10;
            }
            if (evenDigitSum == oddDigitSum){
                System.out.printf("%d ", i);
            }
        }
    }
}
