
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        int sum = 0;
        double avg = 0;
        int odd = 0;
        int even = 0;
        int no = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        while (true) {
            
            int val = Integer.valueOf(scanner.nextLine());
            if (val == -1) {
                break;
            } else {
                sum += val;
                no++;
                if (val % 2 == 1) {
                    odd++;
                } else {
                    even++;
                }
            }
            
        }
        if (no > 0) {
            avg = (1.0 * sum) / no;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + no);
        System.out.println("average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        
        

    }
}
