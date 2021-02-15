import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        String username = term.nextLine();
        String password = term.nextLine();
        String secondPassword = term.nextLine();

        while (!password.equals (secondPassword)){
            secondPassword = term.nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}
