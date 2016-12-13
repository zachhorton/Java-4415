import javax.swing.JOptionPane;
import java.util.*;
/**
 * Created by zachhorton on 11/21/16.
 */
public class SumIntegersInString {
    static String WrittenNums;
    static List<Integer> intList = new ArrayList<Integer>();
    static Integer sumOfNumbers = 0;
    public static void main(String[] args) {
        WrittenNums = JOptionPane.showInputDialog(null, "Enter a list of space-separated integers.").trim();
        ProcessIntegers();
        DisplayInfo();
    }
    static void ProcessIntegers() {
        Integer lastInt = 0;
        Integer endOfList = WrittenNums.length() - 1;
        for (Integer i=0; i < WrittenNums.length(); i++) {
            System.out.println("the char at "+ i+" is: "+WrittenNums.charAt(i));

            if (Character.isDigit(WrittenNums.charAt(i)) && i != endOfList) {
                System.out.println("it's a digit");
            } else {
                String tmpString = WrittenNums.substring(lastInt,i);
                System.out.println("tmpString is: "+tmpString);
                intList.add(Integer.valueOf(tmpString));
                lastInt = i;
            }
        }
        for (Integer i : intList) {
            sumOfNumbers += i;
        }
    }
    static void DisplayInfo() {
        JOptionPane.showMessageDialog(null,"The sum was: " + sumOfNumbers);
    }
}