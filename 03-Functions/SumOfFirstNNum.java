//Write a functions that returns the sum of first n natural numbers.
import java.util.Scanner;
public class SumOfFirstNNum {
    public static int SumOfN(int N){
        Scanner sc= new Scanner(System.in);
        int SumOfN=0;
        for(int i=1; i<=N; i++){
            SumOfN= SumOfN + i;
        }
        return SumOfN;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N=sc.nextInt();
        System.out.println("Sum = "+SumOfN(N));

    }
}
