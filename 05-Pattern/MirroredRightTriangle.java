/*
        Mirrored Right Triangle Star Pattern
            *
           **
          ***
         ****
        *****
 */
import java.util.Scanner;
public class MirroredRightTriangle {
    public static void Mirrored(int num){
        for(int i=0; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Mirrored(n);
    }
    
}
