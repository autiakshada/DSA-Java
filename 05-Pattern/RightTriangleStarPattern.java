/* Right Triangle Star Pattern 
            *
            * *
            * * *
            * * * *
 */
import java.util.Scanner;
public class RightTriangleStarPattern{
    public static void RightStar(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        RightStar(num);
    }
}