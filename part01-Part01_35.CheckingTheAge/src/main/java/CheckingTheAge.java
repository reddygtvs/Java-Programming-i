
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int val = Integer.valueOf(scanner.nextLine());
        if (val < 0 || val > 120) {
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }

    }
}
