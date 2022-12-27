/*Mirrored Rhombus star pattern
    *****
       *****
           *****
              *****
*/
import java.util.Scanner;
public class MirroredRhombus {
    public static void Mirrored(int row, int col, int num){
        for(int i=1;i<=row; i++)
	{
		for(int j=1; j<=i; j++)
		{
			System.out.print(" ");
		}
		for(int x=1; x<=row; x++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. of rows and Col: ");
    int row= sc.nextInt();
    int col= sc.nextInt();
    Mirrored(row, col, col);
  }  
}
