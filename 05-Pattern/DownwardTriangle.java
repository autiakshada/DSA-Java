/*
    Downward Triangle Star Pattern
        * * * * *
        * * * *
        * * *
        * *
        *
*/ 
import java.util.Scanner;                    
public class DownwardTriangle {
    public static void Downward(int num){
        for (int i= num-1; i>=0 ; i--){   
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            } 
            System.out.println();    
        }  

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Downward(n);
    }
}
