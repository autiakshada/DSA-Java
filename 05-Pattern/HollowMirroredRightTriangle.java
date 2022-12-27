/*Hollow Mirrored Right triangle star pattern
         *
       * *
     *   *
   *     * 
 * * * * *
*/ 
import java.util.Scanner;
public class HollowMirroredRightTriangle {
    public static void HollowMirrored(int num){
        for(int i=1; i<=num; i++)
	{	
		for(int s=1; s<=num-i; s++)
		{
			System.out.print(" ");
		}
		for(int j=1; j<=i; j++)
		{
			if(j==1||j==i||i==num)
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
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        HollowMirrored(n);
    }
}
