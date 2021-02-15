import java.util.Scanner;

public class Graduation_Part_2 {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        String studentName = term.nextLine();
        int currentGrade = 1;
        double sum = 0;
        int numberOfRepetitions = 0;

        while (currentGrade <= 12){
            double mark = Double.parseDouble(term.nextLine());
            if (mark < 4){
                numberOfRepetitions++;
                if (numberOfRepetitions == 2){
                    System.out.printf("%s has been excluded at %d grade", studentName, currentGrade);
                    break;
                }
                continue;
            }
            sum = sum + mark;
            currentGrade++;
        }

        if (numberOfRepetitions < 2) {
            double average = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", studentName, average);
        }
    }
}
