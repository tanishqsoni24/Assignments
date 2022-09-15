import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num>=0){
            System.out.println(num);
        }
        else{
            System.out.println(~num + 1);
        }
    }
}
