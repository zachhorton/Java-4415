/**
 * Created by zachhorton on 9/19/16.
 * version 0.1
 * DemoRaise is created to give example of how we can calculate raise values.
 */
public class DemoRaise {
    public static void main(String[] args) {
        double salary = 200.00;
        double startingWage = 800.00;
        System.out.println("Demonstrating some raises");
        predictRaise(400.00);
        predictRaise(salary);
        predictRaise(startingWage);
    }

    private static void predictRaise(double salary) {
        double newSalary;
        final double RAISE_RATE = 1.10;
        newSalary = salary * RAISE_RATE;
        // round newSalary to nearest penny.
        newSalary = Math.round(newSalary);
        System.out.println("Currence salary: " + salary + "\t After raise: " + newSalary);
    }


}
