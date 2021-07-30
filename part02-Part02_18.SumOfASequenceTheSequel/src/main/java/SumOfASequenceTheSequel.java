
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int fir = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int val = Integer.valueOf(scanner.nextLine());
        int fin = 0;
        for (int i = fir; i <= val; i++) {
            fin = fin + i;
        }
        System.out.println("The sum is " + fin);
    }
}
