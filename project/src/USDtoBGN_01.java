import java.util.Scanner;

public class USDtoBGN_01 {
    public static void main(String[] args) {
        //1. da si prochetem dannite -> kolko dolara imame
        //2. da si kalkulirame bulgarskite leva
        //3. da izprintim -> do 2-ri znak

        Scanner term = new Scanner(System.in);
        double usd = Double.parseDouble(term.nextLine());
        double bgn = usd * 1.79549;
        System.out.printf("%.2f",bgn);
    }
}
