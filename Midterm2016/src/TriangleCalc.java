import java.util.Scanner;

/**
 * Created by zachhorton on 10/29/16.
 * Upon entering a height and width, this app will
 * return the area and perimeter of a triangle.
 */
public class TriangleCalc {

    private static Double height;
    private static Double width;
    private static String measurementType;

    public static void main(String[] args) {
        // collect user input
        gatherInfo();
        // compute area
        Double area = computeArea();
        // print info
        showArea(area);

    }

    static void gatherInfo() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the type of measurement (inches, feet, etc.). >> ");
        measurementType = keyboard.nextLine();
        System.out.print("Enter the triangle width. >> ");
        height = (Double) keyboard.nextDouble();
        System.out.print("Enter the triangle height. >> ");
        width = (Double) keyboard.nextDouble();
    }

    // Given height and width, calculate area.
    static Double computeArea() {
        // Area is height x width / 2
        Double area = (height * width) / 2;
        return area;
    }

    // Given the area, print out in readable fashion.
    static void showArea(Double area) {
        String message = "A triangle with a width of " + width + " " + measurementType +
                " and a height of " + height + " " + measurementType +
                " has an  area of " + area + " " + measurementType + ".";
        // Print blank line for spacing
        System.out.println();
        System.out.println(message);
    }
}
