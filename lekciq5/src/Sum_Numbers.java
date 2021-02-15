import java.util.Scanner;

public class Sum_Numbers {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int sum = 0;

        String number = term.nextLine();

        while (!number.equals("Stop")){
            int currentNumber = Integer.parseInt(number);
            sum += currentNumber;
            number = term.nextLine();
        }
        System.out.println(sum);
    }
}
