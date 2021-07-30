
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int val = Integer.valueOf(scanner.nextLine());
        if (val < 5000) {
            System.out.println("No tax!");
        }   else if(val < 25001) {
            System.out.println("Tax: " + (100 + 0.08 * (val - 5000)));
        }   else if(val < 55001) {
            System.out.println("Tax: " + (1700 + 0.10 * (val - 25000)));
        }   else if(val < 200001) {
            System.out.println("Tax: " + (4700 + 0.12 * (val - 55000)));
        }   else if(val < 1000001) {
            System.out.println("Tax: " + (22100 + 0.15 * (val - 200000)));
        }   else {
            System.out.println("Tax: " + (142100 + 0.17 * (val - 1000000)));
        }
    }
}
