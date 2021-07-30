
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int val = Integer.valueOf(scanner.nextLine());
        if (val < 0) {
            System.out.println("Grade: impossible!");
        } else if (val < 50){
            System.out.println("Grade: failed");
        } else if (val < 60){
            System.out.println("Grade: 1");
        } else if (val < 70){
            System.out.println("Grade: 2");
        } else if (val < 80){
            System.out.println("Grade: 3");
        } else if (val < 90){
            System.out.println("Grade: 4");
        } else if (val < 101){
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }
    }
}
