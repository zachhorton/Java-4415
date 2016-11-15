/**
 * Created by zachhorton on 11/14/16.
 */
public class Factorials {

    public static void main(String[] args) {

        for (Integer i=1; i <= 10; i++) {
            Integer tmpFactorial = 1;
            for (Integer j=1; j <=i; j++) {
                tmpFactorial = tmpFactorial * j;
            }
            System.out.println("Factorial for " + i + " is:" + tmpFactorial);
        }
    }

}
