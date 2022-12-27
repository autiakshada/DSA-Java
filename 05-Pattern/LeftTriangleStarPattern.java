/* Left Triangle Star Pattern
                      *
                    * *
                  * * *
                * * * * 
 */
import java.util.Scanner;
public class LeftTriangleStarPattern {
    public static void LeftTriangle(int n) {
      for(int i=0; i<n; i++){
        for (int j=2*(n-i); j>=0; j--){
            System.out.print(" ");
        } 
        for ( int j=0; j<=i; j++ ){
            System.out.print("* ");
        }  
        System.out.println(); 
    }  
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int num = sc.nextInt();
        LeftTriangle(num);
    }
    
}
