import java.util.Scanner;

public class array_matrix {
    public static void main(String[] args) {
        System.out.println("wlcome my matrix programme!");
        System.out.println("Enter your sohag matrix!");
        int sohag[][];
        sohag = new int[2][3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("sohag[%d][%d]=", i, j);
                sohag[i][j] = input.nextInt();
            }

        }
        System.out.println("Enter your rakib matrix!");
        int rakib[][] = new int[2][3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("rakib[%d][%d]=", i, j);
                rakib[i][j] = in.nextInt();
            }

        }
        System.out.println(" your sohag  matrix!");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(+sohag[i][j]);

            }
            System.out.println();
        }
        System.out.println(" your rakib matrix!");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(+rakib[i][j]);
                rakib[i][j] = in.nextInt();
            }
            System.out.println();

        }
    }

}
