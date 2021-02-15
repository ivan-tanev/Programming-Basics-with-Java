import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        double income = Double.parseDouble(term.nextLine());
        double averageGrade = Double.parseDouble (term.nextLine ());
        double minSalary = Double.parseDouble(term.nextLine());
        if (income < minSalary) {
            if (Math.abs(averageGrade) >= 4.5) {
                double scholarship = minSalary * 0.35;
                double scholarshipForExcellentResults = averageGrade * 25;
                if (scholarship > scholarshipForExcellentResults) {
                    System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(scholarship));
                } else if (scholarship <= scholarshipForExcellentResults) {
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(scholarshipForExcellentResults));
                }
            }
        } else if (Math.abs(averageGrade) >= 5.5){
            double scholarshipForExcellentResults = averageGrade * 25;
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(scholarshipForExcellentResults));
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}