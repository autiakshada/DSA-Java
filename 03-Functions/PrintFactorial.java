/*write a program to print the factorial of a number by 
  defining a method name 'Factorial'.Factorial of any number
  n is represented by n! and is equal to 1*2*3*....*(n-1)*n
*/
import java.util.Scanner;
public class PrintFactorial {
    public static int Factorial(int num){
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        System.out.println("The Factorial of "+ num +" is : "+Factorial(num));
    }
}
