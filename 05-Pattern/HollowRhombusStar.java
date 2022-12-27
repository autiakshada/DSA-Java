/*Hollow Rhombus star pattern
	            * * * * *
              *       *
            *      *
          * * * * *
*/
import java.util.Scanner;
public class HollowRhombusStar {
    public static void Rhombus(int num, int row, int col){
        for(int i=1;i<=col; i++)
	{
		for(int s=row-i; s>=1; s--)
		{ 
			System.out.print(" ");
		}
		for(int j=1; j<=row; j++)
		{
			if(i==1||i==row||j==1||j==col)
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
        System.out.println("Enter number of rows and col : ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        Rhombus(m, n, m);
    }
}
