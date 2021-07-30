import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Name:");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.println("Duration:");
            int len = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(name, len));
        }
        System.out.println("Program's maximum duration?");
        int dur = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram limit: programs) {
            if (limit.getDuration() <= dur) {
                System.out.println(limit.getName() + ", " + limit.getDuration() + " minutes");
            }
        }

    }
}
