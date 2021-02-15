import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        String word = term.nextLine();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            System.out.println(letter);
        }
    }
}
