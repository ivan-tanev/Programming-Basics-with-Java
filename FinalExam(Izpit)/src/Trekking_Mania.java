import java.util.Scanner;

public class Trekking_Mania {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        int countOfGroups = Integer.parseInt(term.nextLine());

        double fivePeople = 0;
        double twelvePeople = 0;
        double twentyFivePeople = 0;
        double fourthyPeople = 0;
        double over41 = 0;
        double countOfAllPeople = 0;


        int i = 1;
        while (i <= countOfGroups) {
            int countOfPeopleInOneGroup = Integer.parseInt(term.nextLine());
            if (countOfPeopleInOneGroup <= 5){
                fivePeople += countOfPeopleInOneGroup;
            } else if (countOfPeopleInOneGroup >= 6 && countOfPeopleInOneGroup <= 12){
                twelvePeople += countOfPeopleInOneGroup;
            } else if (countOfPeopleInOneGroup >= 13 && countOfPeopleInOneGroup <= 25){
                twentyFivePeople += countOfPeopleInOneGroup;
            } else if (countOfPeopleInOneGroup >= 26 && countOfPeopleInOneGroup <= 40){
                fourthyPeople += countOfPeopleInOneGroup;
            } else if (countOfPeopleInOneGroup >= 41){
                over41 += countOfPeopleInOneGroup;
            }
            i++;
        }
        countOfAllPeople = fivePeople + twelvePeople + twentyFivePeople + fourthyPeople + over41;

        fivePeople = fivePeople / countOfAllPeople * 100;
        twelvePeople = twelvePeople / countOfAllPeople * 100;
        twentyFivePeople = twentyFivePeople / countOfAllPeople * 100;
        fourthyPeople = fourthyPeople / countOfAllPeople * 100;
        over41 = over41 / countOfAllPeople * 100;

        System.out.printf("%.2f%%%n", fivePeople);
        System.out.printf("%.2f%%%n", twelvePeople);
        System.out.printf("%.2f%%%n", twentyFivePeople);
        System.out.printf("%.2f%%%n", fourthyPeople);
        System.out.printf("%.2f%%", over41);
    }
}
