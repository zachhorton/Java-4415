import java.util.Scanner;
/**
 * Created by zachhorton on 10/31/16.
 */
public class Scholarship {
    static double gradePointAvg;
    static int extraCurricNum;
    static int serviceActNum;
    static boolean qualify;
    public static void main(String[] args) {
        GatherInfo();
        qualify = canScholarship();
        DisplayAnswer();
    }
    static void GatherInfo() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your highschool GPA. >> ");
        gradePointAvg = keyboard.nextDouble();
        if (gpaError()) {
            System.out.println("Invalid GPA.  Please try again.");
            GatherInfo();
        } else {
            System.out.print("Please enter your number of extracurricular activities. >> ");
            extraCurricNum = keyboard.nextInt();
            System.out.print("Please enter your number of service activities. >> ");
            serviceActNum = keyboard.nextInt();
        }
    }
    static boolean gpaError() {
        if (gradePointAvg <= 0 || gradePointAvg > 4.0) {
            return true;
        } else {
            return false;
        }
    }
    static boolean canScholarship() {
        boolean tmpQualify = false;
        if (gradePointAvg >= 3.8) {
            if (extraCurricNum >= 1 && serviceActNum >= 1) {
                tmpQualify = true;
            }
        } else if (3.4 <= gradePointAvg  && gradePointAvg < 3.8) {
            if ((extraCurricNum + serviceActNum) >= 3) {
                tmpQualify = true;
            }
        } else if (3.0 <= gradePointAvg && gradePointAvg < 3.4) {
            if (extraCurricNum >= 2 && serviceActNum >= 3) {
                tmpQualify = true;
            }
        }
        return tmpQualify;
    }
    static void DisplayAnswer() {
        if (qualify) {
            System.out.println("Scholarship Candidate!");
        } else {
            System.out.println("Not a candidate.");
        }
    }
}