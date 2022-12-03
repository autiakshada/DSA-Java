//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;
public class LargestFromAllNum {
    public static int LargestNum() {
        Scanner in = new Scanner(System.in);
        int l = 0;
        while (true) {
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            if (num > l) {
                l = num;
            }
            if (num == 0) {
                return l;
            }
        }
    }

    public static void main(String[] args) {
        int ans = LargestNum();
        System.out.println("Largest number = " + ans);
    }
}