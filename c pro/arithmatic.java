import java.util.Scanner;

public class arithmatic {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter your numbers:");
        Scanner input = new Scanner(System.in);
        Scanner inpiut = new Scanner(System.in);
        a = input.nextInt();
        b = inpiut.nextInt();
        int sum = a + b;
        System.out.printf("The sume is %d", sum);

    }
}
