
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int teamCount = 0;
        int teamWon = 0;
        int teamLost = 0;
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(",");
                if (parts[0].equals(team) || parts[1].equals(team)) {
                    teamCount++;
                    if (parts[0].equals(team)) {
                        if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                            teamWon++;
                        }
                        else {
                            teamLost++;
                        }
                    } else {
                        if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                            teamLost++;
                        } else {
                            teamWon++;
                        }
                    }
                    
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + teamCount);
        System.out.println("Wins: " + teamWon);
        System.out.println("Losses: " + teamLost);

    }

}
