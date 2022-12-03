import java.util.Scanner;
public class Area_of_parallelogram {
    public static void main(String[] args) {
        float b,h,area;
        Scanner sc=new Scanner(System.in);
        b=sc.nextFloat();
        h=sc.nextFloat();
        area=b*h;
        System.out.println("Area of parallelogram= "+area);

    }
}
