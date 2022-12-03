//Write a function to find if a number is a palindrome or not.Take number as parameter.
import java.util.Scanner;
public class PalindromeOrNot {
    public static int palindrome(int num){
        int temp = 0;
        while (num > 0) {
            int x = num % 10;
            num = num / 10;
            temp = temp * 10 + x;
        }
        return temp;

    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int temp = palindrome(num);
        if (num == temp) {
            System.out.println("Number " + num +" is a Palindrome");
        } else {
            System.out.println("Number "+ num +" is not a palindrome");
    }
}
}


