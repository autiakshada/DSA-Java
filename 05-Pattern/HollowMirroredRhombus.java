/*Hollow mirrored Rhombus star pattern
  * * * * *
    *       *
       *       *
          * * * * *
*/
import java.util.Scanner;
public class HollowMirroredRhombus {
    public static void HollowRhombus(int row, int col, int m ){
        for(int i=1;i<=row; i++)
	{
		for(int j=1; j<i; j++)
		{
			System.out.print(" ");
		}
		for(int x=1; x<=row; x++)
		{
			if(i==1||i==row||x==1||x==row)
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
        System.out.println("Enter the no of row and col: ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        HollowRhombus(row, col, col);
    }
}
