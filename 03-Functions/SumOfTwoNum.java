import java.util.Scanner;
public class SumOfTwoNum {
    public static int sum(int num1, int num2){
        int sum;
        sum=num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("The sum of the two number is: "+sum(num1, num2));
    }
    
}
