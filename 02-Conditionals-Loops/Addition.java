//Addition of two numbers.
import java.util.Scanner;
public class Addition{
    public static void main(String[] args) {
        int a, b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of the two number is: "+sum);


    }
}