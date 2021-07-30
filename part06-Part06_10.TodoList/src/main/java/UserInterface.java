/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tushar
 */
import java.util.Scanner;
public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }
    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = this.scanner.nextLine();
            if (input.equals("add")) {
                System.out.println("To add:");
                String lit = this.scanner.nextLine();
                this.list.add(lit);
            } else if (input.equals("list")) {
                this.list.print();
            } else if (input.equals("remove")) {
                System.out.println("Which one is removed?");
                int inp = Integer.valueOf(scanner.nextLine());
                this.list.remove(inp);
            } else if (input.equals("stop")) {
                break;
            }
        }
    }
    public void event(String input) {
        if (input.equals("add")) {
            System.out.println("To add:");
            String lit = this.scanner.nextLine();
            this.list.add(lit);
        } else if (input.equals("list")) {
            this.list.print();
        } else if (input.equals("remove")) {
            System.out.println("Which one is removed?");
            int inp = Integer.valueOf(scanner.nextLine());
            this.list.remove(inp);
        } else if (input.equals("stop")) {
            return;
        }
    }
}
