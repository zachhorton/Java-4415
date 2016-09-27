/**
 * Created by zachhorton on 9/26/16.
 * version 0.1
 * This class is designed to submit two numbers to a method to compute the percentage difference.
 * The main class will send the two numbers one way, then in the reverse.
 */
public class Percentages {

    public static void main(String[] args) {
        double d1 = 5.0;
        double d2 = 12.0;
        computePercent(d1, d2);
        System.out.println("\n"); // Line break for nicer formatting!
        computePercent(d2, d1);
    }

    static void computePercent(double d1, double d2) {
        double percentageOf = (d1 / d2)*100;

        System.out.println("The first double is: "+d1);
        System.out.println("The second double is: "+d2);
        String thePercent = d1+" is "+percentageOf+"% of "+d2;
        System.out.println(thePercent);
    }
}
