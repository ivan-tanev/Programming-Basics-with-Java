import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int examHour = Integer.parseInt(term.nextLine());
        int examMinute = Integer.parseInt(term.nextLine());
        int hourOfArrival = Integer.parseInt(term.nextLine());
        int minuteOfArrival = Integer.parseInt(term.nextLine());

        int examTime = Math.abs(examHour * 60) + examMinute;
        int arrivalTime = Math.abs(hourOfArrival * 60) + minuteOfArrival;

        if (arrivalTime > examTime){
            int timeLate = arrivalTime - examTime;
            if (timeLate >= 60){
                int hoursLate = timeLate / 60;
                int minuteLate = timeLate % 60;
                System.out.println("Late");
                System.out.printf("%d:%02d hours after the start",hoursLate,minuteLate);
            } else if (timeLate < 60){
                int minuteLate = timeLate % 60;
                System.out.println("Late");
                System.out.printf("%d minutes after the start",minuteLate);
            }
        }
        else if (arrivalTime < examTime){
            int timeEarly = examTime - arrivalTime;
            if (timeEarly > 30 && timeEarly < 60){

                int minuteEarly = timeEarly % 60;
                System.out.println("Early");
                System.out.printf("%d minutes before the start",minuteEarly);
            } else if ((timeEarly >= 30) && (timeEarly >= 60 )){
                int hoursEarly = timeEarly / 60;
                int minuteEarly = timeEarly % 60;
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start",hoursEarly,minuteEarly);
            } else if (timeEarly <= 30){
                int minuteEarly = timeEarly % 60;
                System.out.println("On time");
                System.out.printf("%d minutes before the start",minuteEarly);
            }
        }
        else if (arrivalTime == examTime){
            System.out.println("On time");
        }
    }
}
