//write a program to print circumference and the area of circle radius entered by user defining your own method.
import java.util.Scanner;
import java.lang.Math;
public class CircumferenceAreaOfCircle {
    public static void CircumferenceArea(double r){
        double circumference;
        circumference=2*Math.PI*r;
        double area;
        area=Math.PI*r*r;
        System.out.println("Area of circle= "+area);
        System.out.println("Circumference of circle= "+circumference);     
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r= sc.nextInt();
        CircumferenceArea(r);

    }
}
