package schoolDemo;

/**
 * Created by zachhorton on 10/17/16.
 * This class utilizes the schoolDemo.School class blueprint to create and display a school.
 */
public class SchoolDemo {
    public static void main(String[] args) {
        School mySchool = new School("Wasatch Elementary","1050 South Temple",84102,2500);

        mySchool.display();

    }

}
