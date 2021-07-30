
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int no = 0;
        while (true) {
            System.out.println("Give a number:");
            int val = Integer.valueOf(scanner.nextLine());
            if (val == 0) {
                break;
            } else {
                sum = sum + val;
                no = no + 1;
            }
        }
        System.out.println("Number of numbers: " + no);
        System.out.println("Sum of the numbers: " + sum);
    }
}
