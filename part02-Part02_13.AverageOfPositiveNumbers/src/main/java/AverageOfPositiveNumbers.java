
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int no = 0;
        double av = 0;
        while (true) {
            System.out.println("Give a number:");
            int val = Integer.valueOf(scanner.nextLine());
            if (val == 0) {
                if (no == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                } else {
                    av = (1.0 * sum) / no;
                    System.out.println(av);
                    break;
                }
            } else if (val > 0){
                sum = sum + val;
                no = no + 1;
            }
        }
    }
}
