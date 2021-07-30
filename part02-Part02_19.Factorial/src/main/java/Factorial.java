
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int val = Integer.valueOf(scanner.nextLine());
        int fin = 1;
        for (int i = 1; i <= val; i++) {
            fin = fin * i;
        }
        System.out.println("Factorial: " + fin);
    }
}
