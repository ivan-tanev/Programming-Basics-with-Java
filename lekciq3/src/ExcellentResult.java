import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        double grade = Double.parseDouble(term.nextLine());
        if (grade >= 5.50){
            System.out.println("Excellent!");
        }
    }
}