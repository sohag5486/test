import java.util.Scanner;

public class fibonakki {
    public static void main(String[] args) {
        System.out.print("Enter your number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int first = 0;
        int second = 1;
        int fibo;
        System.out.print(first);

        for (int i = 0; i <= n; i++) {
            fibo = first + second;
            System.out.print(+fibo);
            first = second;
            second = fibo;
        }

    }

}
