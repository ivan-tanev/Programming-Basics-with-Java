import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //име, тип и стойност
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String sport = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.printf("I am %s I like %s. I am %d and live in %s.",name, sport, age, town);

    }
}
