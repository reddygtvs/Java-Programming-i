
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("First name: ");
            String firs = scanner.nextLine();
            if (firs.isEmpty()) {
                break;
            }
            System.out.println("Last name: ");
            String las = scanner.nextLine();
            System.out.println("Identification number: ");
            String no = scanner.nextLine();
            infoCollection.add(new PersonalInformation(firs, las, no));
        }
        for (PersonalInformation in: infoCollection) {
            System.out.println(in.getFirstName() + " " + in.getLastName());
        }

    }
}
