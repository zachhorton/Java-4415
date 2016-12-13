package December_5;
import java.util.Scanner;

/**
 * Created by zachhorton on 12/5/16.
 */
public class BadSubscriptCaught {

    public static void main(String[] args) {
        String[] names = {"Ariel", "Benjamin", "Carlos", "Donovan", "Jessica",
                "Nino", "Samuel", "Joseph", "Iris"};
        Scanner keyboard = new Scanner(System.in);
        int number;
        String input = "";
        try {
            System.out.println("Enter a number between 1 and " + names.length + " , and I will display " +
                    "the corresponding name.");
            input = keyboard.next();
            number = Integer.parseInt(input) - 1;
            System.out.println("Name is " + names[number]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Sorry, It seems your input was outside the 1-" + names.length + " range.");
        } catch (NumberFormatException ex) {
            System.out.println("Sorry, your input of " + input + " is not a valid numerical input.");
        }

    }
}