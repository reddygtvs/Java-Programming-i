
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String input = scanner.nextLine();
        try(Scanner read = new Scanner(Paths.get(input))) {
            while (read.hasNextLine()) {
                String[] parts = read.nextLine().split(",");
                System.out.print(parts[0] + ", age:" + parts[1]);
                if (parts[1].equals("1")) {
                    System.out.println(" year");
                } else {
                    System.out.println(" years");
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
