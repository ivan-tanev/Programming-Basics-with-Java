import java.util.Scanner;

public class ScholarshipSecondVersion {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        double income = Double.parseDouble(term.nextLine());
        double averageGrade = Double.parseDouble(term.nextLine());
        double minSalary = Double.parseDouble(term.nextLine());
        if (averageGrade <= 4.50) {
            System.out.println("You cannot get a scholarship!");
        }
        else if (averageGrade > 4.50 && averageGrade < 5.50) {
            if (income > minSalary) {
                System.out.println("You cannot get a scholarship!");
            }
            else {
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(0.35 * minSalary));
            }
        }
        else if (averageGrade >= 5.50) {
            if (income < minSalary) {
                double exselentScholarship1 = 0;
                double exselentScholarship2 = 0;

                exselentScholarship1 = Math.floor(averageGrade * 25);
                exselentScholarship2 = Math.floor(0.35 * minSalary);

                double scholarship = Math.max(exselentScholarship1, exselentScholarship2);

                if (exselentScholarship1 == scholarship) {
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", scholarship);
                }
                else if (exselentScholarship2 == scholarship) {
                    System.out.printf("You get a Social scholarship %.0f BGN", scholarship);
                }
            }
            else {
                double scholarship = Math.floor(averageGrade * 25);
                System.out.printf("You get a scholarship for excellent results %.0f BGN", scholarship);
            }
        }
    }
}
