import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        double number = Double.parseDouble(term.nextLine());
        char sex = term.nextLine().charAt(0);
        if (number >= 16 && sex == 'm'){
            System.out.println("Mr.");
        } else if (number < 16 && sex == 'm'){
            System.out.println("Master");
        } else if (number >= 16 && sex == 'f'){
            System.out.println("Ms.");
        } else if (number < 16 && sex == 'f'){
            System.out.println("Miss");
        }
    }
}