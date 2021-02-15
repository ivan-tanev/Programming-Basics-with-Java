import java.util.Scanner;

public class Exam_Preparation {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int failedGrade = Integer.parseInt(term.nextLine());

        int failedTimes = 0;
        int solvedProblems = 0;
        double allSum = 0;
        String lastProblem = "";
        boolean isFailed = true;

        while (failedTimes < failedGrade) {
            String problemName = term.nextLine();
            if ("Enough".equals(problemName)) {
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(term.nextLine());
            if (grade <= 4) {
                failedTimes++;
            }
            allSum += grade;
            solvedProblems++;
            lastProblem = problemName;
        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", failedGrade);
        } else {
            System.out.printf("Average score: %.2f%n", allSum / solvedProblems);
            System.out.printf("Number of problems: %d%n", solvedProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
