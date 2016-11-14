import java.util.Scanner;

/**
 * Created by zachhorton on 10/31/16.
 */
public class coffee {
    static String menu = makeMenu();
    static int coffeeNum = 1;
    static double price;
    static int counter = 0;

    public static void main(String[] args) {
        makeMenu();
        System.out.println(menu);
        while(coffeeNum != 0 && counter < 3) {
            CollectInfo();
            OrderLogic();
        }
        DisplayOrderPrice();
    }
    static void CollectInfo() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your coffee choice  Entering 0 will exit. >> ");
        coffeeNum = keyboard.nextInt();
    }
    static String makeMenu() {
        String menu = "---------------------\n";
        menu += "(1) American \t 1.99 \n"+"(2) Espresso \t 2.50\n"+"(3) Latte \t\t 2.15";
        menu += "\n---------------------";
        return menu;
    }
    static void OrderLogic() {
        switch(coffeeNum) {
            case 0:
                price += 0;
                counter++;
                break;
            case 1:
                price += 1.99;
                counter++;
                break;
            case 2:
                price += 2.50;
                counter++;
                break;
            case 3:
                price += 2.15;
                counter++;
                break;
            default:
                System.out.println("Invalid option. Try again!");
        }
    }
    static void DisplayOrderPrice() {

        System.out.println("Your order total is: $" + price);

    }

}
