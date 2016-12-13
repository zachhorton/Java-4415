package December_5;
import java.util.Scanner;

/**
 * Created by zachhorton on 12/5/16.
 */
public class EnteringIntegers {
    public static void main(String[] args) {
        int[] numberList = {0, 0, 0, 0, 0, 0};
        int x;
        Scanner input = new Scanner(System.in);
        boolean hasFail = false;
        for(x = 0; x < numberList.length; ++x) {
            try {
                System.out.print("Enter an integer >> ");
                numberList[x] = input.nextInt();
            }
            catch(Exception e) {
                System.out.println("Exception occurred");
                hasFail = true;
                break;
            }
            // input.nextLine();
        }
        if (!hasFail) {
            System.out.print("The numbers are: ");
            for(x = 0; x < numberList.length; ++x) {
                System.out.print(numberList[x] + " ");
            }
            System.out.println();
        } else {
            return;
        }
    }
}