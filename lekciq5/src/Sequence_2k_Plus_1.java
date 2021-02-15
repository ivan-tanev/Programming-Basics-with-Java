import java.util.Scanner;

public class Sequence_2k_Plus_1 {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int number = Integer.parseInt(term.nextLine());
        int sum = 1;

        while (sum <= number){
            System.out.println(sum);
            sum = sum * 2 + 1;
        }
    }
}
