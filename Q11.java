import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter = ");
        int entered = input.next().charAt(0);
        if(entered>=65 && entered<=90){
            System.out.print("Uppercase");
        }
        else if(entered>=97 && entered<=122){
            System.out.print("Lowercase");
        }
    }
}
