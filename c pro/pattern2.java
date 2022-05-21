import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        System.out.println("Enter your number!:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("The number of row of pattern will be=" + n);
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < j + 1; i++)
                System.out.print("*");

            System.out.print("\n");
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)

            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
