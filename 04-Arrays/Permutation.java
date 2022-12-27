//write a java program to how many numbers are smaller than the current number?
import java.util.Scanner;
public class Permutation{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers:");
        float mean=sc.nextFloat();
        int arr[]=0;

        int count = 0;
        for(int i =0;i< arr.length;i++) {
            if(arr[i] < mean)
                count++;
        }
        System.out.println("numbers less than mean " + count);
            }
        }


        