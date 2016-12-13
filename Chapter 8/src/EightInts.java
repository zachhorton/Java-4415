import java.lang.*;
/**
 * Created by zachhorton on 11/21/16.
 */
public class EightInts {
    static Integer[] theInts = {1, 2, 3, 4, 5, 6, 7, 8};
    public static void main(String[] args) {
        DisplayUnits();
    }

    static void DisplayUnits() {
        System.out.println(theInts);
        for (Integer i = theInts.length - 1; i >= 0; i--) {
            System.out.println("placeholder "+i+" is number: "+theInts[i]);
        }
    }
}
