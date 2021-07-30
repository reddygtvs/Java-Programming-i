/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tushar
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dict = dictionary;
    }
    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = this.scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if (input.equals("add")) {
                System.out.println("Word:");
                String word = this.scanner.nextLine();
                System.out.println("Translation:");
                String translation = this.scanner.nextLine();
                this.dict.add(word, translation);
                continue;
            }
            if (input.equals("search")) {
                System.out.println("To be translated:");
                String word = this.scanner.nextLine();
                String compar = this.dict.translate(word);
                if (compar == null) {
                    System.out.println("Word " + word + " was not found");
                    continue;
                } 
                System.out.println("Translation: " + this.dict.translate(word));
                continue;
            }
            System.out.println("Unknown command");
        }
    }
}
