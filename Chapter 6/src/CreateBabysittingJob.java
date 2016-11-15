import java.util.Scanner;

/**
 * Created by zachhorton on 11/14/16.
 */
public class CreateBabysittingJob {
    static Integer year = 0;
    static Integer jobNum = 0;
    static String longNum;
    static Integer babysitterCode = 0;
    static Integer numChildren = 0;
    static Integer hours = 0;
    static BabysittingJob BSJob;
    public static void main(String[] args) {
        CollectInfo();
        year = year % 2000;
        longNum = String.valueOf(year) + String.valueOf(jobNum);
        BSJob = new BabysittingJob(jobNum, babysitterCode, numChildren, hours);
        BSJob.DisplayInfo();
    }
    static void CollectInfo() {
        Scanner keyboard = new Scanner(System.in);

        while (2013 > year || year > 2025) {
            System.out.print("Enter the 4-digit year >>");
            year = keyboard.nextInt();
        }
        while (1 > jobNum || jobNum > 9999) {
            System.out.print("Enter the job number between 1-9999 >>");
            jobNum = keyboard.nextInt();
        }
        while (1 > babysitterCode || babysitterCode > 3) {
            System.out.print("Enter the babysitter code (1, 2, 3) >>");
            babysitterCode = keyboard.nextInt();
        }
        while (numChildren < 1) {
            System.out.print("Enter the number of children >>");
            numChildren = keyboard.nextInt();
        }
        while (hours < 1) {
            System.out.print("Enter the hours the babysitter is needed >>");
            hours = keyboard.nextInt();
        }

    }
}
