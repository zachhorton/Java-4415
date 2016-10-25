/**
 * Created by zachhorton on 10/3/16.
 * version 0.1
 * This class is designed to convert standard inches to metric centimeters.
 * Also converts standard gallons to metric liters
 */
import java.util.Scanner;
public class MetricConversion {
    public static void main(String[] args) {
        Integer inchGal;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter inches or gallons to convert >> ");
        inchGal = keyboard.nextInt();

        if (inchGal != null) {
            InchesToCentimeters(inchGal);
            GallonsToLiters(inchGal);
        }
    }

    static void InchesToCentimeters(Integer inches) {
        Double conversion = 2.54;
        Double centimeters = inches * conversion;
        System.out.println(inches+" inches is equal to "+centimeters+" centimeters.");
    }

    static void GallonsToLiters(Integer gallons) {
        Double conversion = 3.7854;
        Double liters = gallons * conversion;
        System.out.println(gallons+" gallons is equal to "+liters+" liters.");
    }
}
