import java.util.Scanner;
public class Total_surface_area_of_cube {
   public static void main(String[] args) {
    float s, area;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the side of the cube:");
    s=sc.nextFloat();
    area=6*s*s;
    System.out.println("The total surface area of the cube is : "+area);
    } 
}
