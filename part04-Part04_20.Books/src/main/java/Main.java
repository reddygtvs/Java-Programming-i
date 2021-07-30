import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Books> book = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            int pages = Integer.valueOf(scanner.nextLine());
            int year = Integer.valueOf(scanner.nextLine());
            book.add(new Books(title, pages, year));
        }
        String input = scanner.nextLine();
        for (Books list : book) {
            System.out.print(list.getTitle());
            if (input.equals("everything")) {
                System.out.println(", " + list.getPages() + " pages, " + list.getYear());
            }
        }

    }
}
