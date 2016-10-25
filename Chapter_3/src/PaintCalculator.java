/**
 * Created by zachhorton on 10/3/16.
 * version 0.1
 * This class is designed to calculate the required gallons of paint to paint a room.
 */
import java.util.Scanner;
public class PaintCalculator {

    public static void main(String[] args) {
        Integer length;
        Integer width;
        Integer height;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the length of the room in feet. >> ");
        length = keyboard.nextInt();
        System.out.print("Enter the width of the room in feet. >> ");
        width = keyboard.nextInt();
        System.out.print("Enter the height of the room in feet. >> ");
        height = keyboard.nextInt();
        Double costOfPaint = null;
        if (length != null && width != null && height != null) {
            costOfPaint = FindPaintNeeds(length, width, height);
        }
        System.out.println("To paint a room that is "+length+" x "+width+" x "+height+" will cost $"+costOfPaint);
    }
    static Double FindPaintNeeds(Integer length, Integer width, Integer height) {
        // area equals length x height x width.
        Integer totalArea = length*height*width;
        Double gallonsNeeded = paintGallonsNeeded(totalArea);
        System.out.println("In order to paint a total area of "+totalArea+", we will need "+gallonsNeeded+" gallons of paint.");
        Integer pricePerGallon = 32;
        Double costOfPaint = gallonsNeeded * pricePerGallon;
        return costOfPaint;
    }
    static Double paintGallonsNeeded(Integer totalArea) {
        Double feetPerGallon = 350.0;
        Double gallonsNeeded = totalArea / feetPerGallon;
        return gallonsNeeded;
    }
}