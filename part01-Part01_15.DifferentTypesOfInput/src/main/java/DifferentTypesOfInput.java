
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String sentence = scanner.nextLine();
        System.out.println("Give an integer:");
        int value = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double valu = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean val = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string " + sentence);
        System.out.println("You gave the integer " + value);
        System.out.println("You gave the double " + valu);
        System.out.println("You gave the boolean " + val);
        // Write your program here

    }
}
