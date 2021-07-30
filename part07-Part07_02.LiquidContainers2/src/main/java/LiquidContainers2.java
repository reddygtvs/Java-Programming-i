
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            //System.out.print("> ");

            String spl = scanner.nextLine();
            if (spl.equals("quit")) {
                break;
            }
            String[] parts = spl.split(" ");
            String input = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (input.equals("add") && amount > 0) {
                first.add(amount);
            } else if (input.equals("move") && amount > 0) {
                if (first.contains() <= amount) {
                    second.add(first.contains());
                    first.remove(amount);
                } else {
                    second.add(amount);
                    first.remove(amount);
                }
                
            } else if (input.equals("remove") && amount > 0) {
                second.remove(amount);
            }

        }
    }

}
