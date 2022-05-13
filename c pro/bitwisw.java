import java.util.Scanner;

public class bitwisw {
    public static void main(String[] args) {
        System.out.println("Enter your numbers !");
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        int w = a ^ b;
        System.out.println("result=" + w);
    }
}
