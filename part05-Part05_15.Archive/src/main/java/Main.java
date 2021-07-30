
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> array = new ArrayList<>();
        while (true) {
            System.out.println("Identifer? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            Archive sample = new Archive(identifier, name);
            if (!(array.contains(sample))) {
                array.add(sample);
            }
        }
        for (Archive list : array) {
            System.out.println(list);
        }
       

    }
}
