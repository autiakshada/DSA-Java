//Area Of Circle Java Program
import java.util.Scanner;
public class Area_of_circle{
    public static void main(String[] args) {
        double r, area;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of circle ");
        r=in.nextDouble();
        area=3.14*r*r;
        System.out.println("Area of a circle is "+area);
    }
}
