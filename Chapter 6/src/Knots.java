/**
 * Created by zachhorton on 11/14/16.
 */
public class Knots {
    static final Double kiloNaut = 1.852;
    static final Double mileNaut = 1.151;

    public static void main(String[] args) {
        for (Integer i = 15; i <=30; i++) {
            System.out.println(i + " nautical mile is " +
            i * kiloNaut + " kilometers per hour and "+
            i * mileNaut + " miles per hour.");
        }
    }
}
