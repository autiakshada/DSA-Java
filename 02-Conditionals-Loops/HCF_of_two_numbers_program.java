import java.util.Scanner;
public class HCF_of_two_numbers_program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int HCF = 0;
        for (int i=1; i<=x/2 || i<=y/2; i++) {
            if(x%i == 0 && y%i == 0) {
                HCF = i;
            }
        }
        System.out.println("HCF of "+x+" and "+y+" is "+HCF);
    }
}
