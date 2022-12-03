import java.util.Scanner;
public class Volume_of_prism {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float b= sc.nextFloat();
        float h= sc.nextFloat();
        float volume=b*h;
        System.out.println("Volume of Prism= "+volume);
    }
}
