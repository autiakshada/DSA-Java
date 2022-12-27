/* Subtract the product and sum of digits of an integer.
   Eg.Input = 234
    Product :2 * 3 * 4 = 24
    Sum     :2 + 3 + 4 = 9
    Subtract:24 - 9 = 15
    Output: 15
 */ 
import java.util.Scanner;
public class SubtractProductAndSumOfInteger {
        public static int subtractProductAndSum(int n) {
            int product = 1, sum = 0;
            while (n > 0) {
                int r = n % 10;
                n = n / 10;
                sum = sum + r;
                product = product * r;
            }
            int result = product - sum;
            return result;
        }
    
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = in.nextInt();
            int result = subtractProductAndSum(n);
            System.out.println("Result = " + result);
        }
    
}
