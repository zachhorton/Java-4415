import java.util.Scanner;

/**
 * Created by zachhorton on 10/31/16.
 */
public class CondoSales2 {

    static String condoView;
    static int condoNum;
    static int condoPrice;
    static String parkingType;
    static int parkingNum;
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        SetCondoType();
        if (condoNum != 0) {
            SetParkingType();
            if (parkingNum == 0) {
                System.out.println("You have chosen no parking type.");
            }
        }
        DisplayCondoInfo();
    }

    static void SetCondoType() {
        System.out.print("Enter 1 for Park View, 2 for Golf Course View, or 3 for Lake View. >> ");
        condoNum = keyboard.nextInt();
        switch(condoNum) {
            case 1:
                condoView = "Park View";
                condoPrice = 150000;
                break;
            case 2:
                condoView = "Golf Course View";
                condoPrice = 170000;
                break;
            case 3:
                condoView = "Lake View";
                condoPrice = 210000;
                break;
            default:
                condoNum = 0;
                condoView = "Improper selection made.";
                condoPrice = 0;
        }
    }

    static void SetParkingType() {
        System.out.print("Enter 1 for a garage, or 2 for a parking spot. >> ");
        parkingNum = keyboard.nextInt();
        switch(parkingNum) {
            case 1:
                parkingType = "a garage";
                condoPrice += 5000;
                break;
            case 2:
                parkingType = "a parking spot";
                break;
            default:
                parkingNum = 0;
                parkingType = "no parking type selected.";
        }
    }

    static void DisplayCondoInfo() {
        String message = "The "+condoView+" condo";
        if (parkingNum != 0) {
            message += " with "+parkingType;
        }
        message += " is $"+condoPrice+".";
        System.out.println(message);
    }
}
