import java.util.Scanner;

public class patter_mixed {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while (n > 0)

        {
            for (int row = 1; row <= n; row++) {
                for (int cl = 1; cl <= n - row; cl++)

                    System.out.print(" ");
                for (int cl = 1; cl <= 2 * row - 1; cl++)

                    System.out.print("*");
                System.out.println();

            }
            for (int row = n; row >= 1; row--) {
                for (int cl = 1; cl <= n - row; cl++)

                    System.out.print(" ");
                for (int cl = 1; cl <= 2 * row - 1; cl++)

                    System.out.print("*");
                System.out.println();
            }
        }
    }

}