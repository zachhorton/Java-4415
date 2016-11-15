/**
 * Created by zachhorton on 11/14/16.
 */
public class BabysittingJob {
    static Integer jobNumber;
    static Integer employeeCode;
    static String employeeName;
    static Integer numChildren;
    static Integer hours;
    static Integer fee;

    public BabysittingJob(Integer jobNum, Integer empcode, Integer kids, Integer time) {
        jobNumber = jobNum;
        employeeCode = empcode;
        numChildren = kids;
        hours = time;

        switch (employeeCode) {
            case 1:
                employeeName = "Cindy";
                break;
            case 2:
                employeeName = "Greg";
                break;
            case 3:
                employeeName = "Marcia";
                break;
        }
        if (employeeCode == 1) {
            fee = numChildren * 7;
        } else {
            fee = 9 + 4*(numChildren-1);
        }
    }
    public static void DisplayInfo(){
        System.out.println("Job Nuber: " + jobNumber);
        System.out.println("Employee Code: " + employeeCode);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Number of Children: " + numChildren);
        System.out.println("Number of Hours: " + hours);
        System.out.println("Total fee: " + fee);
    }
}
