import java.util.Scanner;

public class Mountain_Run {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        double recordInSecond = Double.parseDouble(term.nextLine());
        double distanceInMeters = Double.parseDouble(term.nextLine());
        double timeInSecondsForOneMeter = Double.parseDouble(term.nextLine());

        double holeDistanceInSeconds = distanceInMeters * timeInSecondsForOneMeter;
        double timeDelay = Math.floor(distanceInMeters / 50) * 30;
        double timeTotal = holeDistanceInSeconds + timeDelay;

        if (timeTotal < recordInSecond){
            System.out.printf("Yes! The new record is %.2f seconds.", timeTotal);
        } else {
            double timeNeeded = recordInSecond - timeTotal;
            System.out.printf("No! He was %.2f seconds slower.", Math.abs(timeNeeded));
        }
    }
}
