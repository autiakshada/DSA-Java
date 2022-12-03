import java.util.Scanner;
public class LCM_of_two_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int max = Math.max(x, y);
        int LCM = 0;
        while(true) {
            if(max%x == 0 && max % y == 0){
                System.out.println(max);
                break;
            }
           max++;
        }
    }
}
