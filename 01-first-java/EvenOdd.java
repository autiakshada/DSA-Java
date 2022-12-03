//Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        if(num % 2==0){
            System.out.println("It is even number");
        }
        else{
            System.out.println("It is odd number");
        }

    }
}
