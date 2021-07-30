
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 2147483647;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            if (input < temp) {
                temp = input;
            }
            list.add(input);
        }
        boolean repeat = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == temp) {
                if (repeat == false) {
                    System.out.println("Smallest number: " + temp);
                    repeat = true;
                }
                System.out.println("Found at index: " + i);
            }
        }
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
