import java.util.Scanner;

public class max_mini {
    public static void main(String[] orgs) {
        System.out.println("Please Enter your numbers!:");
        int sohag[] = new int[10];
        Scanner input = new Scanner(System.in);
        int i;
        for (i = 0; i < 10; i++) {
            sohag[i] = input.nextInt();
        }
        for (int x : sohag) {
            System.out.println("\t" + x);
        }
        double max = sohag[0];
        double mini = sohag[0];
        for (int j = 1; j < 10; j++) {
            if (max < sohag[j]) {
                max = sohag[j];
            }
            if (mini > sohag[j]) {
                mini = sohag[j];

            }
        }
        System.out.println("The maximum number is =" + max);
        System.out.println("The minimum number is =" + mini);
    }

}
