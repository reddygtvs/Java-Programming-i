
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int no = 0;
        double fin = 0;
        while (true) {
            System.out.println("Give a number:");
            int val = Integer.valueOf(scanner.nextLine());
            if (val == 0) {
                fin = (1.0 * sum) / no;
                break;
            } else {
                sum = sum + val;
                no = no + 1;
            }
        }
        System.out.println("Average of the numbers: " + fin);
    }
}
