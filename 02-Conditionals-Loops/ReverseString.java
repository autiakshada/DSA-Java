//Reverse a string in java
import java.util.Scanner;
public class ReverseString{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String x=sc.next();
        String reverse="";
        for(int i=x.length()-1; i>=0; i--){
            reverse=reverse+x.charAt(i);
        }
        System.out.println("Reverse String= "+reverse);
    }
}