import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        //1. read name
        //2. print name -> "Hello, <name>!"
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Hello, ");
        System.out.print(name);
        System.out.print("!");
    }
}
