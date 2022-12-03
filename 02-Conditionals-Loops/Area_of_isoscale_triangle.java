import java.util.Scanner;
public class Area_of_isoscale_triangle {
    public static void main(String[] args) {
        float b,h,area;
        Scanner sc= new Scanner(System.in);
        b=sc.nextFloat();
        h=sc.nextFloat();
        area=b*h/2;
        System.out.println("Area of iscscale triangle= "+area);
    }
}
