import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int time1 = Integer.parseInt(term.nextLine());
        int time2 = Integer.parseInt(term.nextLine());
        int time3 = Integer.parseInt(term.nextLine());
        int sumSeconds = time1 + time2 + time3;
        int minutes = sumSeconds / 60;
        int seconds = sumSeconds % 60;
        if (seconds < 10){
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
