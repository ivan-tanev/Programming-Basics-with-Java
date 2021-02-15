import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);
        String name = term.nextLine();
        int time = 3;
        int projects = Integer.parseInt(term.nextLine());
        double hours = time * projects;
        System.out.printf("The architect %s will need %.0f hours to complete %d project/s.", name, hours, projects);
    }
}
