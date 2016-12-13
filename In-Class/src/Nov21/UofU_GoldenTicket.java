package Nov21;
import javax.swing.JOptionPane;

/**
 * Created by zachhorton on 11/21/16.
 */
public class UofU_GoldenTicket {
    private String First_Name;
    private String Last_Name;
    private String Semester;
    private String Subject;
    private Integer Degree;
    final String UNI_NAME = "University of Utah";
    final String SCHOOL_NAME = "School of Business and Economics";
    private double Tuition;

    public UofU_GoldenTicket(String first, String last, String semester, String subject, Integer degree) {
        First_Name = first;
        Last_Name = last;
        Semester = semester;
        Subject = subject;
        Degree = degree;
        if (Degree == 1) {
            Tuition = 1400;
        } else {
            Tuition = 2500;
        }
    }
    public void display() {
        String Output;
        Output = "\t" + UNI_NAME +
                "\n" + SCHOOL_NAME +
                "\n First Name: " + First_Name +
                "\n Last Name: " + Last_Name +
                "\n Semester: " + Semester +
                "\n Subject: " + Subject +
                "\nYour total tuition is: " + Tuition ;
        JOptionPane.showMessageDialog(null, Output);
    }

}
