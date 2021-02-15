import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        String month = term.nextLine();
        int countOfNights = Integer.parseInt(term.nextLine());

        switch (month){
            case "May":
            case "October":
                double priceForStudio = 0;
                double priceForApartment = 0;
                priceForStudio = countOfNights * 50;
                priceForApartment = countOfNights * 65;
                double discountForStudio = 0;
                double discountForApartment = 0;
                if (countOfNights > 7 && countOfNights <= 14){
                    discountForStudio = priceForStudio - (priceForStudio * 0.05);
                    System.out.printf("Apartment: %.2f lv.", priceForApartment);
                    System.out.printf("%nStudio: %.2f lv.", discountForStudio);
                } else if (countOfNights > 14){
                    discountForStudio = priceForStudio - (priceForStudio * 0.30);
                    discountForApartment = priceForApartment - (priceForApartment * 0.1);
                    System.out.printf("Apartment: %.2f lv.", discountForApartment);
                    System.out.printf("%nStudio: %.2f lv.", discountForStudio);
                } else {
                    System.out.printf("Apartment: %.2f lv.", priceForApartment);
                    System.out.printf("%nStudio: %.2f lv.", priceForStudio);
                }
                break;
            case "June":
            case "September":
                priceForStudio = countOfNights * 75.20;
                priceForApartment = countOfNights * 68.70;
                if (countOfNights > 14){
                    discountForStudio = priceForStudio - (priceForStudio * 0.20);
                    discountForApartment = priceForApartment - (priceForApartment * 0.1);
                    System.out.printf("Apartment: %.2f lv.", discountForApartment);
                    System.out.printf("%nStudio: %.2f lv.", discountForStudio);
                } else {
                    System.out.printf("Apartment: %.2f lv.", priceForApartment);
                    System.out.printf("%nStudio: %.2f lv.", priceForStudio);
                }
                break;
            case "July":
            case "August":
                priceForStudio = countOfNights * 76;
                priceForApartment = countOfNights * 77;
                if (countOfNights > 14){
                    discountForApartment = priceForApartment - (priceForApartment * 0.1);
                    System.out.printf("Apartment: %.2f lv.", discountForApartment);
                    System.out.printf("%nStudio: %.2f lv.", priceForStudio);
                } else {
                    System.out.printf("Apartment: %.2f lv.", priceForApartment);
                    System.out.printf("%nStudio: %.2f lv.", priceForStudio);
                }
                break;
        }
    }
}
