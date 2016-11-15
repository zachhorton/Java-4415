import java.util.Scanner;

/**
 * Created by zachhorton on 11/14/16.
 */
public class InBetween {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Integer num1;
        Integer num2;
        System.out.println("First enter a low number, then a high number.  I will tell you the integers between!");
        System.out.print("Enter the first number >>");
        num1 = (Integer) keyboard.nextInt();
        System.out.print("Now enter the second number >>");
        num2 = (Integer) keyboard.nextInt();
        if (java.lang.Math.abs(num1-num2) <= 1) {
            System.out.println("There are no integers between your two numbers!  Try again.");
            return;
        }
        DisplayIntegers(num1, num2);
    }

    static void DisplayIntegers(Integer num1, Integer num2) {
        Integer first;
        Integer last;
        if (num1 < num2) {
            first = num1;
            last = num2;
        } else {
            first = num2;
            last = num1;
        }
        System.out.println("first is: "+first+" and last is: "+last);
        for (Integer i = first; i < last; i++) {
            System.out.print(i+", ");
        }

    }

}
