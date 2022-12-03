import java.util.Scanner;
public class Area_of_Triangle{
    public static void main(String[] args) {
        float b,h,area;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base and the height of triangle");
        b=sc.nextFloat();
        h=sc.nextFloat();
        area=b*h/2;
        System.out.println("Area of Triangle= "+area);
    }
}
