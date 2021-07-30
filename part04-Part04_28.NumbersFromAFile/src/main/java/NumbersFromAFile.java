
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no = 0;
        String file = scanner.nextLine();
        int lowerBound = Integer.valueOf(scanner.nextLine());
        int upperBound = Integer.valueOf(scanner.nextLine());
        try(Scanner read = new Scanner(Paths.get(file))) {
            while (read.hasNextLine()) {
                int val = Integer.valueOf(read.nextLine());
                if (val >= lowerBound && val <= upperBound) {
                    no++;
                }
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Numbers: " + no);

    }

}
