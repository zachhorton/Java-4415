/**
 * Created by zachhorton on 10/24/16.
 */
public class FormLetterWriter {

    public static void main(String[] args) {
        displaySalutation("Horton");
        displaySalutation("Zachary", "Horton");

    }

    static void displaySalutation(String last) {
        System.out.println("Dear Mr. or Ms. "+last);
        System.out.println("Thank you for your recent order.");
    }


    static void displaySalutation(String first, String last) {
        System.out.println("Dear " + first+ " "+last);
        System.out.println("Thank you for your recent order.");
    }
}
