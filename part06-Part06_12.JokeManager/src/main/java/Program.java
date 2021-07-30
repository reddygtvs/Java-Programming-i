
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        JokeManager joke = new JokeManager();
        joke.addJoke("Just joking 1");
        joke.addJoke("Just joking 2");
        joke.addJoke("Just joking 3");
        UserInterface jokes = new UserInterface(joke, scanner);
        jokes.start();
    }
}
