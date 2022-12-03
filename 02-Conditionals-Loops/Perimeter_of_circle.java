import java.util.Scanner;
public class Perimeter_of_circle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float pi=3.14f,r;//math.PI
        r=sc.nextFloat();
        Float perimeter=2*pi*r;
        System.out.println("Perimeter of circle= "+perimeter);

    }
}