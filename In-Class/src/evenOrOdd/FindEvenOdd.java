package evenOrOdd;
import java.util.Scanner;

/**
 * Created by zachhorton on 10/24/16.
 * This class will ask for a number,
 * and will then determine if it is even or odd.
 */
public class FindEvenOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer number;
        System.out.print("Enter a number >> ");
        number = input.nextInt();

        if (isEven(number)) {
            System.out.println(number + " is even!");
        } else {
            System.out.println(number + " is odd");
        }
    }

    static boolean isEven(Integer num) {
        return (num % 2 == 0);
    }

}
