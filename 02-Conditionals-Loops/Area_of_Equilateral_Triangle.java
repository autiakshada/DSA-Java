import java.util.Scanner;
public class Area_of_Equilateral_Triangle {
    public static void main(String[] args) {
       // Math.sqrt(3)/4*n*n
       Scanner in = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double n = in.nextDouble();
        double area = Math.sqrt(3) / 4 * (n * n);
        System.out.println("Area = " + area);
    
    }
}
