/* Hollow Inverted pyramid star pattern
    * * * * *
     *     *
      *   *
       * *
        *    
*/
import java.util.Scanner;
public class HollowInvertedPyramid {
    public static void PyramidInverted(int num){
        for(int i=num; i>=1; i--)
	{
		for(int s=1; s<=num-i; s++)
		{
			System.out.print(" ");
		}
		for(int j=1; j<=2*i-1; j++)
		{
			if(i==num|| j==1|| j==2*i-1)
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
        System.out.println("Enter the number of rows: ");
        int row=sc.nextInt();
        PyramidInverted(row);
    }
}
