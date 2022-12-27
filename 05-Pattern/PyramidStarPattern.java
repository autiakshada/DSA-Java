/*      Pyramid Star Pattern
            *       
           * *
          * * *
         * * * * 
*/
import java.util.Scanner;
public class PyramidStarPattern {
    public static void Pyramid(int n){
        for(int i=0; i<n; i++){         //int i= Row
            for (int j=n-i; j>1; j--){  //int j= column
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }  
            System.out.println();
    }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        Pyramid(num);
    }
    
}
