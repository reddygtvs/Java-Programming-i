
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        while (true) {
            String temp = scanner.nextLine();
            if (temp.equals("")) {
                break;
            }
            String[] pieces = temp.split(",");
            if (age < Integer.valueOf(pieces[1])) {
                age = Integer.valueOf(pieces[1]);
            }

        }
        System.out.println("Age of the oldest: " + age);
    }
}
