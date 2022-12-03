import java.util.Scanner;
public class sum_of_digits_of_numbers {
    public static void main(String[] args) {
        int num, n, sum=0;
        Scanner sc= new Scanner (System.in);
        System.out.println("Eneter a number: ");
        num= sc. nextInt();
        while(num>0){
            n=num % 10;
            sum= sum+n;
            num=num/10;
        }
        System.out.println("The sum of the digit is "+sum);
    }
}
