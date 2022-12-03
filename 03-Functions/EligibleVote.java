import java.util.Scanner;
public class EligibleVote{
    public static  void Eligibility(int age){
        if(age>=18){
            System.out.println("Candidate is eligible for vote");
        }
        else{
            System.out.println("Candidate is not eligible for vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the candidate: ");
        int age=sc.nextInt();
        Eligibility(age);

    }
}