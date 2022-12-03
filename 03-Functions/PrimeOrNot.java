//Define a method to find out if the number is prime or not
import java.util.Scanner;
public class PrimeOrNot {
    public static boolean prime(int num){
                if (num <= 1) {
                    return false;
                }
                for (int i = 2; i < num / 2; i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
                return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        System.out.println(prime(num));

    }
}
