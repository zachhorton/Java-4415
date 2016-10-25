package schoolDemo;

/**
 * Created by zachhorton on 10/17/16.
 * This is a blueprint of a schoolDemo.School object to be used by other classes.
 */
public class School {

    private String Name;
    private String Address;
    private int Zip;
    private int Enrollment;

    public School (String name, String address, int zip, int enroll) {
        Name = name;
        Address = address;
        Zip = zip;
        Enrollment = enroll;
    }

    public void display() {
        System.out.println("Here is the information about the school:");
        System.out.println("The schoolDemo.School Name is: "+Name);
        System.out.println("The address is: "+Address);
        System.out.println("The Zip Code: "+Zip);
        System.out.println("The Enrollment Number: "+Enrollment);
    }
}
