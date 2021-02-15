import java.util.Scanner;

public class Read_Text {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        String text = term.nextLine();

        while (!text.equals("Stop")){
            text = term.nextLine();
        }
    }
}
