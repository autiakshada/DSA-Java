//Define two methods to print the maximum and minimum nuber respectively among three numbers entered by user.
import java.util.Scanner;
public class MaxMin{
    public static int max (int num1, int num2, int num3){
        int max=num1;
        if(num2>max){
            max=num2;
        }
        if(num3>max){
            max=num3;
        }
        return max;
    }
    public static int min (int num1, int num2, int num3){
        int min=num1;
        if(num2<min){
            min=num2;
        }
        if(num3<min){
            min=num3;
        }
        return min;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:  ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();  
        System.out.println("Maximum Number: "+max(num1,num2,num3));
        System.out.println("Minimum Number: "+min(num1,num2,num3));

    }
}