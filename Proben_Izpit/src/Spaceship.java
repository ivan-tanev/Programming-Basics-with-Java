import java.util.Scanner;

public class Spaceship {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        double shirochina = Double.parseDouble(term.nextLine());
        double duljina = Double.parseDouble(term.nextLine());
        double visochina = Double.parseDouble(term.nextLine());
        double visochinaNaAstronaftite = Double.parseDouble(term.nextLine());

        double obemNaRaketata = shirochina * duljina * visochina;
        double obemNaEdnaStaq = (visochinaNaAstronaftite + 0.40) * 2 * 2;

        double mqstoZa = Math.floor(obemNaRaketata / obemNaEdnaStaq);
        if (mqstoZa < 3){
            System.out.println("The spacecraft is too small.");
        } else if (mqstoZa > 10){
            System.out.println("The spacecraft is too big.");
        } else {
            System.out.printf("The spacecraft holds %.0f astronauts.", mqstoZa);
        }
    }
}
