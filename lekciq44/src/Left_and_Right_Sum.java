import java.util.Scanner;

public class Left_and_Right_Sum {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int numbers = Integer.parseInt(term.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for(int i = 0; i < numbers; i++){
            int currentNumber = Integer.parseInt(term.nextLine());
            leftSum = leftSum + currentNumber;
        }
        for(int i = 0; i < numbers; i++){
            int currentNumber = Integer.parseInt(term.nextLine());
            rightSum = rightSum + currentNumber;
        }
        if (leftSum == rightSum){
            System.out.printf("Yes, sum = %d", leftSum);                    //ili    rightSum
        } else {
            int difference = Math.abs(leftSum - rightSum);
            System.out.printf("No, diff = %d", difference);
        }
    }
}
