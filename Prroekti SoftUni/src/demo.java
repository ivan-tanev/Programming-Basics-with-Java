import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Chetem si dannite
        // 2. Izchislqvame obema v см ^ 3
        // 3. Izchislqvame v litri
        // 4. Izpolzvano prostranstvo
        // 5. Izchislqvame svobodnoto prostranstvo

        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volumeCm = lenght * width * height;
        double volumeLiters = volumeCm * 0.001;
        double percentNumber = percent * 0.01;
        double needLiters = volumeLiters * (1 - percentNumber);
        System.out.printf("%.3f",needLiters);
    }
}
