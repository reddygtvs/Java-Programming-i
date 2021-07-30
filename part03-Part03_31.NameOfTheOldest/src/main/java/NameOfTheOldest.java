
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "";
        while (true) {
            String temp = scanner.nextLine();
            if (temp.equals("")) {
                break;
            }
            String[] pieces = temp.split(",");
            if (age < Integer.valueOf(pieces[1])) {
                age = Integer.valueOf(pieces[1]);
                name = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}
