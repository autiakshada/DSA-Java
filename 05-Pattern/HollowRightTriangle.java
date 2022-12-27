/*
        Hollow Right Triangle Star Pattern
                *
                * *
                *  *
                *   *
                *    *
                * * * *
 */
import java.util.Scanner;
public class HollowRightTriangle {
    public static void HollowTriangle(int num){
        for(int i=1;i<=num; i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(i==num|| i==j||j==1)
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
        int n=sc.nextInt();
        HollowTriangle(n);
    }
}
