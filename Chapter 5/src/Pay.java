import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

/**
 * Created by zachhorton on 10/31/16.
 */
public class Pay {

    static double grossPay;
    static double netPay;
    static double hourlyPay;
    static double hoursWorked;
    static double overtimeWorked;
    static double benefitDeduction = 0;
    static int level;

    static final double LEVEL1 = 17.00;
    static final double LEVEL2 = 20.00;
    static final double LEVEL3 = 22.00;

    static final double MEDICAL = 32.50;
    static final double DENTAL = 20.00;
    static final double DISABILITY = 10.00;
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        GatherInfo();
        ProcessPay();
        ProcessBenefits();
        DisplayPay();
    }

    static void GatherInfo() {
        System.out.print("What is the employee level? (1, 2, or 3) >> ");
        level = keyboard.nextInt();
        System.out.print("How many hours were worked? >>");
        hoursWorked = keyboard.nextDouble();
    }

    static void ProcessPay() {
        switch(level) {
            case 1:
                hourlyPay = LEVEL1;
                break;
            case 2:
                hourlyPay = LEVEL2;
                break;
            case 3:
                hourlyPay = LEVEL3;
                break;
        }
        grossPay = hourlyPay * hourlyPay;
        if (hoursWorked > 40.00) {
            overtimeWorked = hoursWorked - 40.00;
            grossPay += overtimeWorked * hourlyPay * 0.5;
        }

    }

    static void ProcessBenefits() {
        if (level != 1) {
            System.out.println();
            System.out.println("Does employee have current Medical coverage? (y/n) >>");
            String mc = keyboard.nextLine();
            if ( mc == "y" || mc == "yes" ) {
                benefitDeduction += MEDICAL;
            }
            System.out.println("Does employee have current Dental coverage? (y/n) >>");
            String dc = keyboard.nextLine();
            if ( dc == "y" || dc == "yes" ) {
                benefitDeduction += DENTAL;
            }
            System.out.println("Does employee have current Disability coverage? (y/n) >>");
            String dis = keyboard.nextLine();
            if ( dis == "y" || dis == "yes" ) {
                benefitDeduction += DISABILITY;
            }
        }
        if (level == 3) {
            System.out.println("Does employee participate in the retirement plan? (y/n) >>");
            String ret = keyboard.nextLine();
            if ( ret == "y" || ret == "yes" ) {
                benefitDeduction += (0.03) * grossPay;
            }
        }

    }

    static void DisplayPay() {
        System.out.println("The employee worked a total of " + hoursWorked +
                " hours at $" + hourlyPay + " per hour.");
        if (overtimeWorked > 0) {
            System.out.println("The pay for the first 40 hours is $" + hourlyPay * 40);
            System.out.println("The pay for " + overtimeWorked + " overtime hours is $" + overtimeWorked * hourlyPay * 1.5);
        }
        System.out.println("The gross pay total is $" + grossPay);
        if (benefitDeduction > 0) {
            System.out.println("The total cost of the itemized deductions / benefits is $" + benefitDeduction);
        }
        if (benefitDeduction > grossPay) {
            System.out.println("The itemized deductions are more than the pay.  Net pay cannot be displayed.");
        } else {
            System.out.println("The total net pay after deductions is $" + netPay);
        }
    }
}
