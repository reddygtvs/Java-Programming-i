
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a year:");
        int val = Integer.valueOf(scanner.nextLine());
        if (val < 2015) {
            System.out.println("Ancient history!");
        }
        // Write your program here
    }
}
