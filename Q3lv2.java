import java.util.Scanner;

public class Q3lv2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter = ");
        int entered = input.nextInt();
        int o=entered, sum=0;
        int rem;
        while (o>0) {
            rem = o%10;
            sum = sum*10+(rem);
            o/=10;
        }
        if(entered==sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
