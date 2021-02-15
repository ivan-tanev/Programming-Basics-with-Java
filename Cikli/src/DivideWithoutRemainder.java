import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int n = Integer.parseInt(term.nextLine());
        int countFirst = 0;
        int countSecond = 0;
        int countThird = 0;

        for (int number = 0; number < n ; number++) {
            int value = Integer.parseInt(term.nextLine());
            if (value % 2 == 0){
                countFirst++;
            }
            if (value % 3 == 0){
                countSecond++;
            }
            if (value % 4 == 0){
                countThird++;
            }
        }
        double p1 = (countFirst * 1.0) / n * 100;
        double p2 = (countSecond * 1.0) / n * 100;
        double p3 = (countThird * 1.0) / n * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%", p3);
    }
}
