import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int breadth = input.nextInt();
        String ans = length==breadth ? "square" : "not square";
        System.out.println(ans);
    }
}
