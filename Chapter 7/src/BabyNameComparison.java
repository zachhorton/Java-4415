import javax.swing.JOptionPane;

/**
 * Created by zachhorton on 11/21/16.
 */
public class BabyNameComparison {

    static String name1;
    static String name2;
    static String name3;

    public static void main(String[] args) {
        name1 = JOptionPane.showInputDialog(null, "Please enter the 1st baby name.");
        name2 = JOptionPane.showInputDialog(null, "Please enter the 2nd baby name.");
        name3 = JOptionPane.showInputDialog(null, "Please enter the 3rd baby name.");
        ProcessNames();
    }

    static void ProcessNames() {
        String names;
        names = name1 + " " + name2 + "\n" +
                name1 + " " + name3 + "\n" +
                name2 + " " + name1 + "\n" +
                name2 + " " + name3 + "\n" +
                name3 + " " + name1 + "\n" +
                name3 + " " + name2 + "\n";
        JOptionPane.showMessageDialog(null,names);
    }

}
