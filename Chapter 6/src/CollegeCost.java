import java.util.Scanner;

/**
 * Created by zachhorton on 11/14/16.
 */
public class CollegeCost {

    public static void main(String[] args) {
        Integer age;
        Integer collegeCost;
        Integer yearlySavings;
        Integer yearsTo18;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the child's age (under 18) >>");
        age = keyboard.nextInt();
        while (age >= 18) {
            System.out.print("Enter the child's age (under 18) >>");
            age = keyboard.nextInt();
        }
        System.out.print("Enter the estimated cost of college >>");
        collegeCost = keyboard.nextInt();

        yearsTo18 = 18 - age;
        yearlySavings = collegeCost / yearsTo18;
        System.out.println("You must save $" + yearlySavings + " per year until the child is 18.");
    }
}
