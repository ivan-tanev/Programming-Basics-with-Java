import java.util.Scanner;

public class Train_The_Trainers {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int juryCount = Integer.parseInt(term.nextLine());

        double allParticipantsAverageGrade = 0;
        int participantsCounter = 0;
        while (true){
            String input = term.nextLine();

            if (input.equals("Finish")){
                break;
            }

            participantsCounter++;

            String presentationName = input;

            double averagePresentationGrade = 0;
            for (int i = 0; i < juryCount; i++) {
                double grade = Double.parseDouble(term.nextLine());
                averagePresentationGrade += grade;
            }
            averagePresentationGrade /= juryCount;
            allParticipantsAverageGrade += averagePresentationGrade;

            System.out.printf("%s - %.2f.%n", presentationName, averagePresentationGrade);
        }
        allParticipantsAverageGrade /= participantsCounter;
        System.out.printf("Student's final assessment is %.2f.", allParticipantsAverageGrade);
    }
}
