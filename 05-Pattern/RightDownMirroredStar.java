/*
        Right Down Mirror star pattern
              *****
               ****
                ***
                 **
                  *
 */
import java.util.Scanner;
public class RightDownMirroredStar {
    public static void RightDown(int n){
        for(int i=0; i>=1; i--){
          for (int j=n; j>i;j--){
            System.out.print("  ");
          }  
          for (int j=1;j<=i;j++){
            System.out.print("*");
          }  
          System.out.println();

        }
    }
  
      public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
        RightDown(n);
  } 
}

