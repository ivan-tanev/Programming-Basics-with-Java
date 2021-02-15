import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        String word = term.nextLine();
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            switch (letter){
                case 'a':
                    count = count + 1;
                    break;
                case 'e':
                    count = count + 2;
                    break;
                case 'i':
                    count = count + 3;
                    break;
                case 'o':
                    count = count + 4;
                    break;
                case 'u':
                    count = count + 5;
                    break;
            }
        }
        System.out.println(count);
    }
}
