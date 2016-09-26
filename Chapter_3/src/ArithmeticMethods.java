/**
 * Created by zachhorton on 9/26/16.
 */
public class ArithmeticMethods {

    public static void main(String[] args) {
        Integer int1 = 3;
        Integer int2 = 7;

        displayNumberPlus10(int1);
        displayNumberPlus100(int1);
        displayNumberPlus1000(int1);

        displayNumberPlus10(int2);
        displayNumberPlus100(int2);
        displayNumberPlus1000(int2);

    }

    static void displayNumberPlus10(Integer baseNum) {
        Integer totalNum = baseNum + 10;
        System.out.println("The number "+baseNum+" plus 10 is: "+totalNum);
    }
    static void displayNumberPlus100(Integer baseNum) {
        Integer totalNum = baseNum + 100;
        System.out.println("The number "+baseNum+" plus 100 is: "+totalNum);
    }
    static void displayNumberPlus1000(Integer baseNum) {
        Integer totalNum = baseNum + 1000;
        System.out.println("The number "+baseNum+" plus 1000 is: "+totalNum);
    }
}

