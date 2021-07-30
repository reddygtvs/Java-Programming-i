
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        SimpleDictionary dict = new SimpleDictionary();
        Scanner scanner = new Scanner(System.in);
        TextUI trans = new TextUI(scanner, dict);
        trans.start();
    }
}
