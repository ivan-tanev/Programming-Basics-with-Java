import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int hour = Integer.parseInt(term.nextLine());
        int minutes = Integer.parseInt(term.nextLine());
        int totalInMinutes = hour * 60 + minutes;
        int totalInMinutesPlus15 = totalInMinutes + 15;
        int endHour = totalInMinutesPlus15 / 60;
        int endMinutes = totalInMinutesPlus15 % 60;
        if (endHour == 24){
            endHour = 0;
        }
        System.out.printf("%d:%02d",endHour, endMinutes);
    }
}
