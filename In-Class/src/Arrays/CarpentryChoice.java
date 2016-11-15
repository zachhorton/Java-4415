package Arrays;
import javax.swing.JOptionPane;
import java.util.HashMap;
/**
 * Created by zachhorton on 11/14/16.
 */
public class CarpentryChoice {
    public static void main(String[] args) {
        HashMap<String,Integer> items = new HashMap<String, Integer>();
        items.put("table",250);
        items.put("desk",325);
        items.put("dresser",420);
        items.put("entertainmen center",600);

        String menu = "Enter selection:";
        for (String item : items.keySet()) {
            menu += "\n " + item;
        }
        String selection = JOptionPane.showInputDialog(null, menu);
        if (items.containsKey(selection.toLowerCase())) {
            JOptionPane.showMessageDialog(null,"The price is $" + items.get(selection));
        } else {
            Boolean foundLikeness = false;
            for (String item : items.keySet()) {
                if (item.startsWith(selection)) {
                    JOptionPane.showMessageDialog(null,"The price is $" + items.get(item));
                    foundLikeness = true;
                    break;
                }
            }
            if (!foundLikeness) {
                JOptionPane.showMessageDialog(null,"Invalid Entry");
            }
        }

    }
}
