//Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two numbers: ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        if(num1>num2)
        {
            System.out.println("The largest number is "+num1);
        }
        else{
            System.out.println("The largest number is "+num2);
        }
    }
}
