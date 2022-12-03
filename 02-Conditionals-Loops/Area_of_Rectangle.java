import java.util.Scanner;
public class Area_of_Rectangle {
    public static void main(String[] args) {
        float w,l,Area;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the width and length of rectangle:  ");
        w=sc.nextFloat();
        l=sc.nextFloat();
        Area=w*l;
        System.out.println("Area of rectangle= "+Area);
    }
    
}
