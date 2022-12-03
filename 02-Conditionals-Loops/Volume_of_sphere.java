import java.util.Scanner;
public class Volume_of_sphere {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        float r=sc.nextFloat();
        float pi=3.14f;
        float volume=4/3*pi*r*r*r;
        System.out.println("Volume of Spere= "+volume);

    }
}
