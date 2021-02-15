import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int tabsCount = Integer.parseInt(term.nextLine());
        int salary = Integer.parseInt(term.nextLine());

        for (int tab = 1; tab <= tabsCount; tab++){
            String siteName = term.nextLine();
            switch (siteName){
                case "Facebook":
                    salary = salary - 150;         //salary -= 150;
                    break;
                case "Instagram":
                    salary = salary - 100;
                    break;
                case "Reddit":
                    salary = salary -50;
                    break;
            }
            if (salary <= 0){
                break;
            }
        }
        if (salary <= 0){
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%d", salary);
        }
    }
}
