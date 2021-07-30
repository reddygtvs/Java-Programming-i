
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = 0;
        int check = 0;
        int count = 0;
        String name = "";
        while (true) {
            String temp = scanner.nextLine();
            if (temp.equals("")) {
                break;
            }
            count++;
            String[] pieces = temp.split(",");
            len += Integer.valueOf(pieces[1]);
            if (check < pieces[0].length()) {
                name = pieces[0];
                check = pieces[0].length();
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.00 * len / count));

    }
}
