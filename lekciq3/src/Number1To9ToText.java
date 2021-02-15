import java.util.Scanner;

public class Number1To9ToText {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        String number = term.nextLine();
        if (number.equals("1")) {
            System.out.println("one");
        } else if (number.equals("2")) {
            System.out.println("two");
        }
    else if(number.equals("3"))

    {
        System.out.println("three");
    }else if(number.equals("4"))

    {
        System.out.println("four");
    }else if(number.equals("5"))

    {
        System.out.println("five");
    }else if(number.equals("6"))

    {
        System.out.println("six");
    }else if(number.equals("7"))

    {
        System.out.println("seven");
    }else if(number.equals("8"))

    {
        System.out.println("eight");
    }else if(number.equals("9"))

    {
        System.out.println("nine");
    }else

    {
        System.out.println("number too big");
    }
}
}
