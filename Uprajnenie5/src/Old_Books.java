import java.util.Scanner;

public class Old_Books {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        String searchedBook = term.nextLine();
        int countBooks = Integer.parseInt(term.nextLine());
        int countCheckedBooks = 0;

        while (countBooks > 0){
            String title = term.nextLine();
            if (title.equals(searchedBook)){
                System.out.printf("You checked %d books and found it.", countCheckedBooks);
                break;
            } else {
                countBooks--;
                countCheckedBooks++;
            }
        }
        if (countBooks == 0){
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countCheckedBooks);
        }
    }
}
