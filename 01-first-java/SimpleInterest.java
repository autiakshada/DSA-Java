//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        float P,T,R,Si;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal, time and rate:");
        P= sc.nextFloat();
        T= sc.nextFloat();
        R= sc.nextFloat();
        Si=(P*T*R)/100;
        System.out.println("simple interest=  "+Si);

    }
    
}
