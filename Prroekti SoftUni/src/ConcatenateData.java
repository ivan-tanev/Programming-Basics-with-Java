import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        String firstname = term.nextLine();
        String lastname = term.nextLine();
        int age = Integer.parseInt(term.nextLine());
        String town = term.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.", firstname, lastname, age, town);
    }
}
