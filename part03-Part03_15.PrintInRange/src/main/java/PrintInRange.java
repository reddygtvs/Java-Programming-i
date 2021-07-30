
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int higherLimit) {
        for (int number: numbers) {
            if (number >= lowerLimit && number <= higherLimit) {
                System.out.println(number);
            }
        }
    }
    
}
