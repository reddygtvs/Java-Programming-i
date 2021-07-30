
import java.util.Scanner;

public class LiquidContainers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            //System.out.print("> ");

            String spl = scanner.nextLine();
            if (spl.equals("quit")) {
                break;
            }
            String[] parts = spl.split(" ");
            String input = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (input.equals("add") && amount > 0) {
                first += amount;
                if (first > 100) {
                    first = 100;
                }
            } else if (input.equals("move") && amount > 0) {
                if (first <= amount) {
                    second += first;
                    first = 0;
                } else {
                    second += amount;
                    first -= amount;
                }
                if (second > 100) {
                    second = 100;
                }
            } else if (input.equals("remove") && amount > 0) {
                second -= amount;
                if (second < 0) {
                    second = 0;
                }
            }

        }
    }

}
