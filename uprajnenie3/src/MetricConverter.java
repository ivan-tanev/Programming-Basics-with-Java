import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        double number = Double.parseDouble(term.nextLine());
        String entry = term.nextLine();
        String exit = term.nextLine();
        if (entry.equals("m")){
            double millimeters = number * 1000;
            double centimeters = number * 100;
            if (exit.equals("cm")){
                System.out.printf("%.3f", centimeters);
            } else if (exit.equals("mm")){
                System.out.printf("%.3f", millimeters);
            }
        }
        if (entry.equals("cm")){
            double meters = number / 100;
            double millimeters = number * 10;
            if (exit.equals("m")){
                System.out.printf("%.3f", meters);
            } else if (exit.equals("mm")){
                System.out.printf("%.3f", millimeters);
            }
        }
        if (entry.equals("mm")){
            double meters = number / 1000;
            double centimeters = number / 10;
            if (exit.equals("m")){
                System.out.printf("%.3f", meters);
            } else if (exit.equals("cm")){
                System.out.printf("%.3f", centimeters);
            }
        }
    }
}
