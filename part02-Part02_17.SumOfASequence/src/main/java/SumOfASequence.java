
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int val = Integer.valueOf(scanner.nextLine());
        int fin = 0;
        for (int i = 1; i <= val; i++) {
            fin = fin + i;
        }
        System.out.println("The sum is " + fin);
    }
}
