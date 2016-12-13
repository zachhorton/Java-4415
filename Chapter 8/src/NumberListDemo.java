import java.lang.*;
import java.util.*;
import java.util.Scanner;

/**
 * Created by zachhorton on 11/21/16.
 */
public class NumberListDemo {
    static Integer[] theInts = new Integer[8];
    static Integer theSum = 0;
    static Integer theAvg;
    public static void main(String[] args) {
        CollectInts();
        DisplayForward();
        DisplayReverse();
        DisplaySum();
        DisplayLessThan5();
        DisplayLowest();
        DisplayHighest();
        DisplayAvg();
        DisplayOverAverage();
    }
    static void CollectInts() {
        Scanner keyboard = new Scanner(System.in);
        for (Integer i = 0; i < theInts.length; i++) {
            System.out.print("Enter Integer number " + (i+1) + " >>");
            theInts[i] = (Integer) keyboard.nextInt();
        }
    }
    static void DisplayReverse() {
        System.out.println(theInts);
        for (Integer i = theInts.length - 1; i >= 0; i--) {
            System.out.println("placeholder "+i+" is number: "+theInts[i]);
        }
    }
    static void DisplayForward() {
        System.out.println(theInts);
        for (Integer i = 0; i < theInts.length - 1; i++) {
            System.out.println("placeholder "+i+" is number: "+theInts[i]);
        }
    }
    static void DisplaySum() {
        for (Integer i = 0; i < theInts.length; i++) {
            theSum += theInts[i];
        }
        System.out.println("The sum is: "+theSum);
    }
    static void DisplayLessThan5() {
        Integer numBelow5 = 0;
        String message = "These numbers are less than 5: ";
        for (Integer i = 0; i < theInts.length; i++) {
            if (theInts[i] < 5) {
                message += i+" ";
                numBelow5++;
            }
        }
        if (numBelow5 > 0) {
            System.out.println(message);
        }
    }
    static void DisplayLowest() {
        Arrays.sort(theInts);
        System.out.println("The lowest number is: "+theInts[0]);
    }
    static void DisplayHighest() {
        Arrays.sort(theInts);
        System.out.println("The highest number is: "+theInts[theInts.length - 1]);
    }
    static void DisplayAvg() {
        theAvg = theSum / theInts.length;
        System.out.println("The average is: "+theAvg);
    }
    static void DisplayOverAverage() {
        Integer numAboveAvg = 0;
        String message = "These numbers are over the average of " + theAvg + ": ";
        for (Integer i = 0; i < theInts.length; i++) {
            if (theInts[i] > theAvg) {
                message += theInts[i]+" ";
                numAboveAvg++;
            }
        }
        if (numAboveAvg > 0) {
            System.out.println(message);
        }
    }
}
