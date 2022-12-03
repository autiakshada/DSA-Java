import java.util.Scanner;
public class Perimeter_of_rectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float l,w,perimeter;
        l=sc.nextFloat();
        w=sc.nextFloat();
        perimeter=2*(l+w);
        System.out.println("Perimeter of rectangle= "+perimeter);

    }
}
