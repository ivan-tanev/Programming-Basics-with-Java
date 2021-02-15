import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int budget = Integer.parseInt(term.nextLine());
        String season = term.nextLine();
        int fishers = Integer.parseInt(term.nextLine());
        double rent = 0;

        switch (season){
            case "Spring":
                if (fishers <= 6) {
                    rent = 3000 - (3000 * 0.10);
                    if (fishers % 2 == 0) {
                        double discount = rent - (rent * 0.05);
                        if (discount >= budget) {
                            double moneyLeft = Math.abs(discount - budget);
                            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                        } else {
                            double neededMoney = Math.abs(budget - discount);
                            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                        }
                    } else {
                        if (rent <= budget) {
                            double moneyLeft = Math.abs(rent - budget);
                            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                        } else {
                            double neededMoney = Math.abs(budget - rent);
                            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                        }
                    }
                } else if (fishers > 7 && fishers <= 11){
                    rent = 3000 - (3000 * 0.15);
                    if (fishers % 2 == 0) {
                        double discount = rent - (rent * 0.05);
                        if (discount >= budget) {
                            double moneyLeft = Math.abs(discount - budget);
                            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                        } else {
                            double neededMoney = Math.abs(budget - discount);
                            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                        }
                    } else {
                        if (rent <= budget) {
                            double moneyLeft = Math.abs(rent - budget);
                            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                        } else {
                            double neededMoney = Math.abs(budget - rent);
                            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                        }
                    }
                } else if (fishers >=12){
                    rent = 3000 - (3000 * 0.25);
                    if (fishers % 2 == 0) {
                        double discount = rent - (rent * 0.05);
                        if (discount >= budget) {
                            double moneyLeft = Math.abs(discount - budget);
                            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                        } else {
                            double neededMoney = Math.abs(budget - discount);
                            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                        }
                    } else {
                        if (rent <= budget) {
                            double moneyLeft = Math.abs(rent - budget);
                            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                        } else {
                            double neededMoney = Math.abs(budget - rent);
                            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                        }
                    }
                }
                break;
            case "Summer":
                if (fishers <= 6) {
                    rent = 4200 - (4200 * 0.10);
                    if (fishers % 2 == 0) {
                        double discount = rent - (rent * 0.05);
                        if (discount >= budget) {
                            double moneyLeft = Math.abs(discount - budget);
                            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                        } else {
                            double neededMoney = Math.abs(budget - discount);
                            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                        }
                    } else {
                        if (rent <= budget) {
                            double moneyLeft = Math.abs(rent - budget);
                            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                        } else {
                            double neededMoney = Math.abs(budget - rent);
                            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                        }
                    }
                } else if (fishers > 7 && fishers <= 11){
                    rent = 4200 - (4200 * 0.15);
                    if (fishers % 2 == 0) {
                        double discount = rent - (rent * 0.05);
                        if (discount >= budget) {
                            double moneyLeft = Math.abs(discount - budget);
                            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                        } else {
                            double neededMoney = Math.abs(budget - discount);
                            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                        }
                    } else {
                        if (rent <= budget) {
                            double moneyLeft = Math.abs(rent - budget);
                            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                        } else {
                            double neededMoney = Math.abs(budget - rent);
                            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                        }
                    }
                } else if (fishers >=12){
                    rent = 4200 - (4200 * 0.25);
                    if (fishers % 2 == 0) {
                        double discount = rent - (rent * 0.05);
                        if (discount >= budget) {
                            double moneyLeft = Math.abs(discount - budget);
                            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                        } else {
                            double neededMoney = Math.abs(budget - discount);
                            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                        }
                    } else {
                        if (rent <= budget) {
                            double moneyLeft = Math.abs(rent - budget);
                            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                        } else {
                            double neededMoney = Math.abs(budget - rent);
                            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                        }
                    }
                }
                break;
            case "Autumn":
                if (fishers <= 6) {
                    rent = 4200 - (4200 * 0.10);
                    if (rent < budget || rent == budget){
                        double moneyLeft = Math.abs(rent - budget);
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (rent > budget) {
                        double neededMoney = Math.abs(rent - budget);
                        System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                    }
                } else if (fishers > 7 && fishers <= 11){
                    rent = 4200 - (4200 * 0.15);
                    if (rent < budget || rent == budget){
                        double moneyLeft = Math.abs(rent - budget);
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (rent > budget) {
                        double neededMoney = Math.abs(rent - budget);
                        System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                    }
                } else if (fishers >=12){
                    rent = 4200 - (4200 * 0.25);
                    if (rent < budget || rent == budget){
                        double moneyLeft = Math.abs(rent - budget);
                        System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                    } else if (rent > budget) {
                        double neededMoney = Math.abs(rent - budget);
                        System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                    }
                }
                break;
            case "Winter":
                if (fishers <= 6) {
                    rent = 2600 - (2600 * 0.10);
                    if (fishers % 2 == 0) {
                        double discount = rent - (rent * 0.05);
                        if (discount >= budget) {
                            double moneyLeft = Math.abs(discount - budget);
                            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                        } else {
                            double neededMoney = Math.abs(budget - discount);
                            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                        }
                    } else {
                        if (rent <= budget) {
                            double moneyLeft = Math.abs(rent - budget);
                            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                        } else {
                            double neededMoney = Math.abs(budget - rent);
                            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                        }
                    }
                } else if (fishers > 7 && fishers <= 11){
                    rent = 2600 - (2600 * 0.15);
                    if (fishers % 2 == 0) {
                        double discount = rent - (rent * 0.05);
                        if (discount >= budget) {
                            double moneyLeft = Math.abs(discount - budget);
                            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                        } else {
                            double neededMoney = Math.abs(budget - discount);
                            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                        }
                    } else {
                        if (rent <= budget) {
                            double moneyLeft = Math.abs(rent - budget);
                            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                        } else {
                            double neededMoney = Math.abs(budget - rent);
                            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                        }
                    }
                } else if (fishers >=12){
                    rent = 2600 - (2600 * 0.25);
                    if (fishers % 2 == 0) {
                        double discount = rent - (rent * 0.05);
                        if (discount >= budget) {
                            double moneyLeft = Math.abs(discount - budget);
                            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                        } else {
                            double neededMoney = Math.abs(budget - discount);
                            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                        }
                    } else {
                        if (rent <= budget) {
                            double moneyLeft = Math.abs(rent - budget);
                            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
                        } else {
                            double neededMoney = Math.abs(budget - rent);
                            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
                        }
                    }
                }
                break;
        }
    }
}
