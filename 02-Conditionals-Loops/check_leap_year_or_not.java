import java.util.Scanner;
public class check_leap_year_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n%4==0){
            System.out.println("It is leap year");
        }
        else{
            System.out.println("It is not leap year");
        }
    }
}
