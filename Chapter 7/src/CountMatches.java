import javax.swing.JOptionPane;
import java.util.*;

/**
 * Created by zachhorton on 11/21/16.
 */
public class CountMatches {
    static String word1;
    static String word2;
    static Integer numberOfMatches = 0;
    static List<String> letterMatches = new ArrayList<String>();
    static String StringOfMatches;
    public static void main(String[] args) {
        word1 = JOptionPane.showInputDialog(null, "Please enter the 1st word.");
        word2 = JOptionPane.showInputDialog(null, "Please enter the 2st word.");
        FindMatches();
        DisplayMatchInfo();
    }

    static void FindMatches() {
        if (word1 == null || word2 == null) {
            JOptionPane.showMessageDialog(null,"You did not enter one of the words.");
        }
        for (Integer i=0; i < word1.length(); i++) {
            if (word2.contains(word1.substring(i,i+1))) {
                numberOfMatches++;
                letterMatches.add(word1.substring(i,i+1));
            }
        }
        for (String s : letterMatches) {
            if (StringOfMatches == null) {
                StringOfMatches = s;
            } else {
                StringOfMatches = StringOfMatches + ", " + s;
            }
        }
    }
    static void DisplayMatchInfo() {
        if (numberOfMatches == 0) {
            JOptionPane.showMessageDialog(null,"Sorry, there were no matching letters");
        } else {

            JOptionPane.showMessageDialog(null,"Congratulations, there were " + numberOfMatches + " matching letters!");
            JOptionPane.showMessageDialog(null,"The matching letters are " + StringOfMatches);
        }
    }
}