import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        String figure = term.nextLine();
        double length;
        double a;
        double b;
        double r;
        if (figure.equals("square")){
            length = Double.parseDouble(term.nextLine());
            double face = length * length;
            System.out.printf("%.3f",face);
        }else if (figure.equals("rectangle")){
            a = Double.parseDouble(term.nextLine());
            b = Double.parseDouble(term.nextLine());
            double face = a * b;
            System.out.printf("%.3f",face);
        }else if (figure.equals("circle")){
            r = Double.parseDouble(term.nextLine());
            double face = r * r * Math.PI;
            System.out.printf("%.3f",face);
        }else if (figure.equals("triangle")){
            length = Double.parseDouble(term.nextLine());
            double h = Double.parseDouble(term.nextLine());
            double face = (length * h) / 2;
            System.out.printf("%.3f", face);
        }
    }
}
