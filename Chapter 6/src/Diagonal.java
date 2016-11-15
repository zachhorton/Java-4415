/**
 * Created by zachhorton on 11/14/16.
 */
public class Diagonal {
    public static void main(String[] args) {
        for (Integer i = 0; i < 5; i++) {
            String spaceX = "";
            for (Integer j = 0; j < i; j++) {
                spaceX += " ";
            }
            spaceX += "X";
            System.out.println(spaceX);
        }
    }
}
