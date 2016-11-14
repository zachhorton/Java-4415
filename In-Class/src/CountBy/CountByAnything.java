package CountBy;

import java.util.Scanner;

/**
 * Created by zachhorton on 10/31/16.
 */
public class CountByAnything {
    static int START;
    static int STOP;

    public static void main(String[] args) {
        int NUMBER_PER_LINE = 1;
        GetInfo();
        for (int i=START;i<=STOP;i += START) {

            System.out.print(i + " ");

            if (NUMBER_PER_LINE == 10) {
                System.out.println();
                NUMBER_PER_LINE = 1;
            } else {
                NUMBER_PER_LINE++;
            }
        }
    }
    static void GetInfo() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Count in increments of >> ");
        START = keyboard.nextInt();
        System.out.print("Please enter your stopping point. >> ");
        STOP = keyboard.nextInt();
    }
}