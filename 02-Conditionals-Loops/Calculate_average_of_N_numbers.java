//Calculate Average Of N Numbers
import java.util.Scanner;
public class Calculate_average_of_N_numbers {
    public static void main(String[] args) {
        int n;
        double x=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter how many numbers to caculate average");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter  "+n+" numbers:");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            x=x=a[i];
        }
        System.out.println("Average= "+x/n);
    }    
}
