/*Write a program that will ask the user to enter his/her marks(out of 100).
 * Define a method that will display grades according to the marks entered as
 * below.
 * Marks        Grade 
   91-100         AA 
   81-90          AB 
   71-80          BB
   61-70          BC 
   51-60          CD 
   41-50          DD 
   <=40          Fail 

 */
import java.util.Scanner;
public class DisplayGrade {
    public static void Grade(float marks){
        if (marks >= 91) {
            System.out.println("AA");
        } else if (marks <= 90 && marks >= 81) {
            System.out.println("AB");
        } else if (marks <= 80 && marks >= 70) {
            System.out.println("BB");
        } else if (marks <= 70 && marks >= 61) {
            System.out.println("BC");
        } else if (marks <= 60 && marks >= 51) {
            System.out.println("CD");
        } else if (marks <= 50 && marks >= 41) {
            System.out.println("DD");
        } else if (marks <= 40) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid marks!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks out of 100: ");
        float marks=sc.nextFloat();
        Grade(marks);
    }
}
