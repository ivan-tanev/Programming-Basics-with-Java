import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int n = Integer.parseInt(term.nextLine());
        int countFirst = 0;
        int countSecond = 0;
        int countThird = 0;
        int countFourth = 0;
        int countFifth = 0;

        for (int number = 1; number <= n ; number++) {
            int value = Integer.parseInt(term.nextLine());
            if (value < 200){
                countFirst++;
            } else if (value >= 200 && value <= 399){
                countSecond++;
            } else if (value >= 400 && value <= 599){
                countThird++;
            } else if (value >= 600 && value <= 799){
                countFourth++;
            } else {
                countFifth++;
            }
        }
        double p1 = (countFirst * 1.0) / n * 100;
        double p2 = (countSecond * 1.0) / n * 100;
        double p3 = (countThird * 1.0) / n * 100;
        double p4 = (countFourth * 1.0) / n * 100;
        double p5 = (countFifth * 1.0) / n * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%", p5);
    }
}
