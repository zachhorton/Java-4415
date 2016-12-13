package Nov21;
import java.util.ArrayList;

/**
 * Created by zachhorton on 11/21/16.
 */
public class JavaApplication30 {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();
            obj.add("John");
            obj.add("Sarah");
            obj.add("Brown");
            obj.add("Steve");
            obj.add("Jose");

        System.out.println("Currently, the array list has the following elements: "+obj);

            obj.add(0, "Rahul");
            obj.add(1, "Justin");
        System.out.println("second elemends: "+obj);
            obj.remove(1);
        System.out.println("Third Elements: "+obj);
        for (String s : obj) {
            System.out.println(s);
        }
    }
}
