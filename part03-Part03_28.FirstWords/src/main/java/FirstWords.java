
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String temp = scanner.nextLine();
            if (temp.equals("")) {
                break;
            }
            String[] pieces = temp.split(" ");
            System.out.println(pieces[0]);

        }
    }
}
