import java.util.Scanner;

/**
 * Created by zachhorton on 10/29/16.
 * Upon entering a height and width, this app will
 * return the area and perimeter of a rectangle.
 */
public class RectangleCalc {

    private static Double height;
    private static Double width;
    private static String measurementType;

    public static void main(String[] args) {
        // collect user input
        gatherInfo();
        // compute area and perimeter
        Double area = computeArea();
        Double perimeter = computePerimeter();
        // print info
        showCalculation(area, "area");
        showCalculation(perimeter, "perimeter");
    }
    // Gather necessary info from user
    static void gatherInfo() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the type of measurement (inches, feet, etc.). >> ");
        measurementType = keyboard.nextLine();
        System.out.print("Enter the rectangle width. >> ");
        height = keyboard.nextDouble();
        System.out.print("Enter the rectangle height. >> ");
        width = keyboard.nextDouble();
    }

    // Given height and width, calculate area.
    static Double computeArea() {
        // Area is height x width
        Double area = height * width;
        return area;
    }

    // Given height and width, calculate perimeter
    static Double computePerimeter() {
        // Perimeter is 2(height) + 2(width)
        Double perimeter = height*2 + width*2;
        return perimeter;
    }
    // Given the area, print out in readable fashion.
    static void showCalculation(Double measurement, String calcType) {
        String message = "A rectangle with a width of " + width + " " + measurementType +
                " and a height of " + height + " " + measurementType +
                " has a(n) " + calcType + " of " + measurement + " " + measurementType + ".";
        // Print blank line for spacing
        System.out.println();
        System.out.println(message);
    }
}
