import java.util.Scanner;

/**
 * Created by zachhorton on 10/31/16.
 */
public class CondoSales {

    static String condoView;
    static int condoNum;
    static int condoPrice;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter 1 for Park View, 2 for Golf Course View, or 3 for Lake View. >> ");
        condoNum = keyboard.nextInt();
        SetCondoType(condoNum);
        DisplayCondoInfo();
    }

    static void SetCondoType(int num) {
        switch(num) {
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
                condoView = "Improper selection made.";
                condoPrice = 0;
        }
    }

    static void DisplayCondoInfo() {
        String message = "The "+condoView+" condo is $"+condoPrice+".";
        System.out.println(message);
    }
}
