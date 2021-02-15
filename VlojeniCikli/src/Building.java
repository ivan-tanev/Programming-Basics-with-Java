import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int floors = Integer.parseInt(term.nextLine());
        int rooms = Integer.parseInt(term.nextLine());

        for (int i = floors; i > 0; i--) {
            for (int j = 0; j < rooms; j++) {
                if (i == floors){
                    if (j == (rooms - 1)) {
                        System.out.printf("L%d%d%n", i, j);
                    } else {
                        System.out.printf("L%d%d ", i, j);
                    }
                }
                if (i % 2 == 0 && i != floors){
                    if (j == (rooms - 1)) {
                        System.out.printf("O%d%d%n", i, j);
                    } else {
                        System.out.printf("O%d%d ", i, j);
                    }
                } else if (i % 2 == 1 && i != floors){
                    if (j == (rooms - 1)) {
                        System.out.printf("A%d%d%n", i, j);
                    } else {
                        System.out.printf("A%d%d ", i, j);
                    }
                }
            }
        }
    }
}
