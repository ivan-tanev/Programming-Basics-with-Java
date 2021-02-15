import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        double speed = Double.parseDouble(term.nextLine());
        if (speed <= 10){
            System.out.printf("slow");
        } else if (speed <= 50){
            System.out.println("average");
        } else if (speed <= 150){
            System.out.println("fast");
        } else if (speed <= 1000){
            System.out.println("ultra fast");
        } else if (speed > 1000){
            System.out.println("extremely fast");
        }
    }
}
