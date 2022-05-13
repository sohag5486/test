import java.util.Scanner;

public class love {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        // int i,rows,j;
        while (rows > 0)

        {
            for (int i = 1; i <= rows; i += 2) {
                /* Printing Spaces */
                for (int j = 1; j < rows - i; j += 2) {
                    System.out.print(" ");
                }
                /* printing stars for left semi circle */
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                /* Printing Spaces */
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
                /* printing stars for right semi circle */
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                /* move to next row */
                System.out.println();
            }

            /* printing inverted start pyramid */
            for (int i = rows; i >= 1; i--) {
                for (int j = i; j < rows; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (i * 2) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
