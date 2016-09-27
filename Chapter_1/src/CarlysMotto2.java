/**
 * Created by zachhorton on 9/19/16.
 */
public class CarlysMotto2 {
    public static void main(String[] args) {
//        String motto = CarlysMotto.motto();
        showMotto(CarlysMotto.motto());
    }
    static void showMotto(String motto) {
        motto = "* "+motto+" *";
        String border = borderTopBottom(motto);
        System.out.println(border);
        System.out.println(motto);
        System.out.println(border);
    }
    static String borderTopBottom(String motto) {
        Integer mottoLength = motto.length();
        String border = null;
        for (Integer i = 0; i < mottoLength; i++) {
            if (border == null) {
                border = "";
            }
            border += "*";
        }
        return border;
    }
}
