//Define a method that returns the product of two numbers entered by user.
import java.util.Scanner;
public class ProductOfTwoNum {
    public static int  product(int num1, int num2) {
        int product;
        product=num1*num2;
        return product;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1= sc. nextInt();
        int num2= sc.nextInt();
        System.out.println("The product of the two number is : "+product(num1, num2));
    }
}
