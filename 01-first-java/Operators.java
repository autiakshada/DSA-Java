//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        int a,b;
        char op;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter two number: ");
        a= sc.nextInt();
        b=sc.nextInt();
        op=sc.next().charAt(0);
        int ans=0;
        if(op =='+'|| op == '-'|| op =='/'|| op == '*')
        {
            if(op =='+'){
                ans=a + b;
            }
            if(op =='-'){
                ans=a - b;
            }
            if(op =='/'){
                ans=a / b;
            }
            if(op =='*'){
                ans=a * b;
            }
        }
        else{
            System.out.println("Invalid Operator!!");
        }
        System.out.println( a + op + b + " = "+ans);
    }
}
