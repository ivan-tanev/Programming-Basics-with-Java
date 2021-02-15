import java.util.Scanner;

public class DanceHall_05 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        double lenght = Double.parseDouble(terminal.nextLine());
        double width = Double.parseDouble(terminal.nextLine());
        double sideWardrobe = Double.parseDouble(terminal.nextLine());

        double hallArea = (lenght * 100) * (width * 100);
        double benchArea = hallArea / 10;
        double wardrobeArea = (sideWardrobe * 100) * (sideWardrobe * 100);
        double freeSpace = hallArea - benchArea - wardrobeArea;
        double dancers = freeSpace / 7040;

        System.out.printf("%.0f",Math.floor(dancers));
    }
}
