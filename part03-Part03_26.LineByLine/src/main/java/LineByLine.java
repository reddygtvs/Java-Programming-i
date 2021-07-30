
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String ini = scanner.nextLine();
            if (ini.equals("")) {
                break;
            }
            String[] pieces = ini.split(" ");
            for (int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);
            }
        }
        

    }
}
