import java.util.Scanner;

public class Max_Number {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int countOf_N = Integer.parseInt(term.nextLine());
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= countOf_N; i++) {
            int n = Integer.parseInt(term.nextLine());
            if (n > max && n != 0){
                max = n;
            }
        }
        System.out.println(max);
    }
}
