import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        String product = term.nextLine();
        String city = term.nextLine();
        double capacity = Double.parseDouble(term.nextLine());
        double coffee = 0;
        double water = 0;
        double beer = 0;
        double sweets = 0;
        double peanuts = 0;

        switch (product){
            case "coffee":
                if (city.equals("Sofia")){
                    coffee = capacity * 0.50;
                    System.out.printf("%f", coffee);
                } else if (city.equals("Plovdiv")){
                    coffee = capacity * 0.40;
                    System.out.printf("%f", coffee);
                } else if (city.equals("Varna")){
                    coffee = capacity * 0.45;
                    System.out.printf("%f", coffee);
                }
                break;
            case "water":
                if (city.equals("Sofia")){
                    water = capacity * 0.80;
                    System.out.printf("%f", water);
                } else if (city.equals("Plovdiv")){
                    water = capacity * 0.70;
                    System.out.printf("%f", water);
                } else if (city.equals("Varna")){
                    water = capacity * 0.70;
                    System.out.printf("%f", water);
                }
                break;
            case "beer":
                if (city.equals("Sofia")){
                    beer = capacity * 1.20;
                    System.out.printf("%f", beer);
                } else if (city.equals("Plovdiv")){
                    beer = capacity * 1.15;
                    System.out.printf("%f", beer);
                } else if (city.equals("Varna")){
                    beer = capacity * 1.10;
                    System.out.printf("%f", beer);
                }
                break;
            case "sweets":
                if (city.equals("Sofia")){
                    sweets = capacity * 1.45;
                    System.out.printf("%f", sweets);
                } else if (city.equals("Plovdiv")){
                    sweets = capacity * 1.30;
                    System.out.printf("%f", sweets);
                } else if (city.equals("Varna")){
                    sweets = capacity * 1.35;
                    System.out.printf("%f", sweets);
                }
                break;
            case "peanuts":
                if (city.equals("Sofia")){
                    peanuts = capacity * 1.60;
                    System.out.printf("%f", peanuts);
                } else if (city.equals("Plovdiv")){
                    peanuts = capacity * 1.50;
                    System.out.printf("%f", peanuts);
                } else if (city.equals("Varna")){
                    peanuts = capacity * 1.55;
                    System.out.printf("%f", peanuts);
                }
                break;
        }
    }
}
