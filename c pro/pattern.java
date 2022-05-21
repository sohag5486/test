import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        System.out.println("Enter your number!:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.printf("%d\n", n);
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < j + 2; i++)
                System.out.print("*");

            System.out.print("\n");
        }

    }
}