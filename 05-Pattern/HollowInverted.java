/*
    Hollow Inverted Right Triangle Star patter
    * * * * *
    *     *
    *   *
    * *
    *
 */
import java.util.Scanner;
public class HollowInverted {
    public static void Inverted(int num){
        for(int i=num; i>=1; i--)
        {	
            for(int j=1; j<=i; j++)
            {
                if(i==num||j==i||j==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
    
            }
            System.out.println();
        }
    
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        Inverted(n);
    }
}
