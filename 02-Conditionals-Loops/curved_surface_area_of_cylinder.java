import java.util.Scanner;
public class curved_surface_area_of_cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r= sc.nextFloat();
        float h= sc.nextFloat();
        float pi=3.14f;
        float ans=2*pi*r*h;
        System.out.println("Curved surface area of Cylinder= "+ans);
    }
}
