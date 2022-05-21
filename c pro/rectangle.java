import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        System.out.println("Enter your numver:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                if (r == 1 || r == n || c == n || c == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }

}
