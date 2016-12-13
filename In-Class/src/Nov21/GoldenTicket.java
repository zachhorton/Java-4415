package Nov21;

import javax.swing.*;

/**
 * Created by zachhorton on 11/21/16.
 */
public class GoldenTicket {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        String semester;
        String subject;
        Integer degree;
        firstName = JOptionPane.showInputDialog(null,"Please enter First Name");
        lastName = JOptionPane.showInputDialog(null,"Please enter Last Name");
        semester = JOptionPane.showInputDialog(null,"Please enter semester");
        subject = JOptionPane.showInputDialog(null,"Please enter subject");
        degree = Integer.parseInt(JOptionPane.showInputDialog(null,"Please insert 1 for Bachelors, 2 for graduate"));

        UofU_GoldenTicket GoldenTicket1 = new UofU_GoldenTicket(firstName, lastName, semester, subject, degree);
        GoldenTicket1.display();
    }
}
