import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int countOfPasingers = Integer.parseInt(term.nextLine());
        int countOfStations = Integer.parseInt(term.nextLine());

        int i = 1;
        while (i <= countOfStations) {
            int slizashti = Integer.parseInt(term.nextLine());
            int kachvashti = Integer.parseInt(term.nextLine());
            if (i % 2 == 1){
                countOfPasingers = countOfPasingers - slizashti + kachvashti + 2;
            } else {
                countOfPasingers = countOfPasingers - slizashti + kachvashti - 2;
            }
            i++;
        }
        System.out.printf("The final number of passengers is : %d", countOfPasingers);
    }
}
