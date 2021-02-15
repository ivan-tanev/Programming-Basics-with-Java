import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int numbers = Integer.parseInt(term.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < numbers; i++){
            int currentNumber = Integer.parseInt(term.nextLine());
            if (currentNumber > max){
                max = currentNumber;
            }
            if (currentNumber < min){
                min = currentNumber;
            }
        }
        System.out.printf("Max number: %d%n", max);
        System.out.printf("Min number: %d", min);
    }
}
