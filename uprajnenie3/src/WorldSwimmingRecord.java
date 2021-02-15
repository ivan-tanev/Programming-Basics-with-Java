import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(term.nextLine());
        double distanceInMetres = Double.parseDouble(term.nextLine());
        double timeForOneMeterInSeconds = Double.parseDouble(term.nextLine());
        double allRange = distanceInMetres * timeForOneMeterInSeconds;
        double metersDelay = Math.floor(distanceInMetres / 15);
        double delay = metersDelay * 12.5;
        double timeTotal = allRange + delay;
        if (recordInSeconds > timeTotal){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeTotal);
        } else {
            double timeNeeded = timeTotal - recordInSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeNeeded);
        }
    }
}
