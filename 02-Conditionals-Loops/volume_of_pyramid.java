import java.util.Scanner;
public class volume_of_pyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float l=sc.nextFloat();
        float w=sc.nextFloat();
        float h=sc.nextFloat();
        float volume=(l*w*h)/3;
        System.out.println("Volume of pyramid= "+volume);
    }
}
