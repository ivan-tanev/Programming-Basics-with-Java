import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        String fruit = term.nextLine();
        String day = term.nextLine();
        double capacity = Double.parseDouble(term.nextLine());
        double cena = 0;

        switch (fruit){
            case "banana":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        cena = capacity * 2.50;
                        System.out.printf("%.2f", cena);
                        break;
                    case "Saturday":
                    case "Sunday":
                        cena = capacity * 2.70;
                        System.out.printf("%.2f", cena);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "apple":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        cena = capacity * 1.20;
                        System.out.printf("%.2f", cena);
                        break;
                    case "Saturday":
                    case "Sunday":
                        cena = capacity * 1.25;
                        System.out.printf("%.2f", cena);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "orange":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        cena = capacity * 0.85;
                        System.out.printf("%.2f", cena);
                        break;
                    case "Saturday":
                    case "Sunday":
                        cena = capacity * 0.90;
                        System.out.printf("%.2f", cena);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "grapefruit":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        cena = capacity * 1.45;
                        System.out.printf("%.2f", cena);
                        break;
                    case "Saturday":
                    case "Sunday":
                        cena = capacity * 1.60;
                        System.out.printf("%.2f", cena);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "kiwi":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        cena = capacity * 2.70;
                        System.out.printf("%.2f", cena);
                        break;
                    case "Saturday":
                    case "Sunday":
                        cena = capacity * 3.00;
                        System.out.printf("%.2f", cena);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "pineapple":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        cena = capacity * 5.50;
                        System.out.printf("%.2f", cena);
                        break;
                    case "Saturday":
                    case "Sunday":
                        cena = capacity * 5.60;
                        System.out.printf("%.2f", cena);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "grapes":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        cena = capacity * 3.85;
                        System.out.printf("%.2f", cena);
                        break;
                    case "Saturday":
                    case "Sunday":
                        cena = capacity * 4.20;
                        System.out.printf("%.2f", cena);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
