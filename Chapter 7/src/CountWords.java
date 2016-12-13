import javax.swing.*;

/**
 * Created by zachhorton on 11/21/16.
 */
public class CountWords {
    static String theString;
    static Integer numberOfWords = 0;
    static Integer endOfLine;

    public static void main(String[] args) {

        theString = JOptionPane.showInputDialog(null, "Please enter your string.");
        endOfLine = theString.length() - 1;
        CountWords();
    }

    static void CountWords() {
        Boolean word = false;
        for (Integer i=0; i < theString.length(); i++) {
            if (Character.isLetter(theString.charAt(i)) && i != endOfLine) {
                word = true;
            } else if (!Character.isLetter(theString.charAt(i)) && word) {
                numberOfWords++;
                word = false;
            } else if (Character.isLetter(theString.charAt(i)) && i == endOfLine) {
                numberOfWords++;
            }
        }
        JOptionPane.showMessageDialog(null, "There are " + numberOfWords + " words in your string!");
    }
}
