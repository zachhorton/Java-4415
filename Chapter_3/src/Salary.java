/**
 * Created by zachhorton on 10/3/16.
 */
import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Double hourlyWage;
        Double normalHours;
        Double overtimeHours;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the hourly pay rate. >> ");
        hourlyWage = keyboard.nextDouble();
        System.out.print("Enter the number of normal hours. >> ");
        normalHours = keyboard.nextDouble();
        System.out.print("Enter the number of overtime hours. >> ");
        overtimeHours = keyboard.nextDouble();
        Double normalPay = CalculateStandardPay(hourlyWage, normalHours);
        System.out.println("Working "+normalHours+" hours at $"+hourlyWage+" per hour makes $"+normalPay+" per week.");
        if (overtimeHours != null && overtimeHours != 0) {
            Double payWithOvertime = CalculateOvertimePay(hourlyWage, normalHours, overtimeHours);
            System.out.println("Including overtime pay, the total weekly pay is: $"+payWithOvertime);
        }
    }

    static Double CalculateStandardPay(double wage, double hours) {
        Double weeklyPay = wage * hours;
        return weeklyPay;
    }

    static Double CalculateOvertimePay(double wage, double normalHours, double overtimeHours) {
        Double overtimeRate = 1.5;
        Double overtimePay = CalculateStandardPay(wage, overtimeHours) * overtimeRate;
        Double normalPay = CalculateStandardPay(wage, normalHours);
        Double totalPay = overtimePay + normalPay;
        return totalPay;
    }
}
