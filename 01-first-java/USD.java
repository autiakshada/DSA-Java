//Input currency in rupees and output in USD.
import java.util.Scanner;
public class USD {
    public static void main(String[] args) {
        float rupees, dollar;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rupee: ");
        rupees=sc.nextFloat();
        dollar=rupees/81.41f;
        System.out.println("Dollar:$ "+dollar);
    }
}
