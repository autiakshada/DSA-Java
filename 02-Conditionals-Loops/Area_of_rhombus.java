import java.util.Scanner;
public class Area_of_rhombus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the two diagonal of Rhombus: ");
        float d1=sc.nextFloat();
        float d2=sc.nextFloat();
        float area=d1*d2/2;
        System.out.println("Area of Rhombus=  "+area);

    }
}
