
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a year:");
        int val = Integer.valueOf(scanner.nextLine());
        if (val % 100 == 0) {
            if (val % 400 == 0) {
                System.out.println("This year is a leap year.");
            } else {
                System.out.println("This year is not a leap year.");
            }
        }   else if(val % 4 == 0) {
            System.out.println("This year is a leap year.");
        }   else {
            System.out.println("This year is not a leap year.");
        }
    }
}
