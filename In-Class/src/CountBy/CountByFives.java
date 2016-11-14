package CountBy;

/**
 * Created by zachhorton on 10/31/16.
 */
public class CountByFives {
    public static void main(String[] args) {
        int START = 5;
        int STOP = 200;
        int NUMBER_PER_LINE = 50;
        for (int i=START;i<=STOP;i += START) {

            System.out.print(i + " ");

            if (i % NUMBER_PER_LINE == 0) {
                System.out.println();
            }
        }
    }
}
