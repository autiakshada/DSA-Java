//Define a program to find out whether a given number is even or odd.
import java.util.Scanner;
public class EvenOdd {
    public static int evenodd(int num){
        if(num % 2==0){
            System.out.println(num+ " is even number.");
        }
        else{
            System.out.println(num+ " is odd number.");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        evenodd(num);

    }
    
}
