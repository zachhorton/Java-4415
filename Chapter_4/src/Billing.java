import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by zachhorton on 10/24/16.
 */
public class Billing {
    final static double taxRate = 0.08;
    static Double thePrice;
    static Integer theQuantity;
    static Integer theDiscount;
    public static void main(String[] args) {
        AskForData();
        DisplayTheData();
    }
    static double computeBill(double price) {
        double taxAmount = price * taxRate;
        price = price + taxAmount;
        return price;
    }
    static double computeBill(double price, Integer qty) {
        double subTotal = price * qty;
        double taxAmount = subTotal * taxRate;
        price = subTotal + taxAmount;
        return price;
    }
    static double computeBill(double price, Integer qty, Integer percentDiscount) {
        double subTotal = price * qty;
        double discountAmount = subTotal * (percentDiscount / 100);
        double taxAmount = (subTotal - discountAmount) * taxRate;
        price = subTotal - discountAmount - taxAmount;
        return price;
    }

    static void ShowTotal(double bill) {
        DecimalFormat df = new DecimalFormat("#.##");
        bill = Double.valueOf(df.format(bill));
        System.out.println("Your total bill is: $" + bill);
    }

    static void AskForData() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the price per unit. >> ");
        thePrice = keyboard.nextDouble();
        System.out.print("Enter the quantity. >> ");
        theQuantity = keyboard.nextInt();
        System.out.print("Enter the discount, if any. >> ");
        theDiscount = keyboard.nextInt();
    }

    static void DisplayTheData() {
        if (thePrice == null || thePrice == 0 || theQuantity == null) {
            return;
        } else {
            ShowTotal(computeBill(thePrice));
            ShowTotal(computeBill(thePrice,theQuantity));
        }
        if (theDiscount != null && theDiscount != 0) {
            ShowTotal(computeBill(thePrice,theQuantity,theDiscount));
        }
    }
}
