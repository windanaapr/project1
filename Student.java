import java.util.Scanner;
public class Student extends Person{
    
    String University;
    String Stream;
    int StudentID;
    public void getDetail(){
        super.getDetail();
        Scanner input = new Scanner (System.in);
        System.out.println("Enter The Academic Details");
        System.out.println("Enter The Course Enrolled");
        Stream = input.nextLine();
        System.out.println("Enter Student ID");
        StudentID = input.nextInt();
        showDetail();
    }
    public void showDetail(){
        System.out.println("The Details Entered Are: \n");
        System.out.println("First Name:  " + super.firstname);
        System.out.println("Last Name:   " + super.lastname);
        System.out.println("Age:         " + super.age);
        System.out.println("Course Enrolled: " + Stream);
        System.out.println("Student ID:      " + StudentID);
    }
}
