import java.util.Scanner;

public class Sum_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int From = Integer.parseInt(term.nextLine());
        int To = Integer.parseInt(term.nextLine());
        int sum = 0;
        int magicalNumber = Integer.parseInt(term.nextLine());
        int count = 0;
        boolean flag = false;

        for (int i = From; i <= To ; i++) {
            for (int j = From; j <= To; j++) {
                sum = i + j;
                count++;
                if (sum == magicalNumber){
                    From = i;
                    To = j;
                    break;
                }
            }
            if (sum == magicalNumber){
                System.out.printf("Combination N:%d (%d + %d = %d)", count, From, To, sum);
                flag = true;
                break;
            }
        }
        if (flag == false){
            System.out.printf("%d combinations - neither equals %d", count, magicalNumber);
        }
    }
}
