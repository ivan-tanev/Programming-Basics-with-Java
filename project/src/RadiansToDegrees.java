import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //1. Chetem kakvoto e vuvedeno v konsolata
        //2. izchislqvame gradusite = radiani * 180 / PI
        //3. print

        double radians = Double.parseDouble(console.nextLine());
        double degrees = radians * 180 / Math.PI;
        System.out.printf("%.0f",degrees);

    }
}
