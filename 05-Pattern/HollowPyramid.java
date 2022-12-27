/*Hollow Pyramid Star Pattern
	                 *
                   *   *
                 *       *
               *           *
             *  *  *  *   *  *
*/
import java.util.Scanner;
public class HollowPyramid {
    public static void PyramidHollow(int num){
        for(int i=1; i<=num; i++)
	{
		for(int s=1; s<=num-i; s++)
		{
			System.out.print(" ");
		}
	    for(int j=1; j<=2*i-1; j++)
		{
			if(i==num|| j==1|| j==(2*i-1))
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
        PyramidHollow(n);
    }
}
