import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] sohag = new int[5];
        sohag[0] = 10;
        sohag[1] = 15;
        sohag[2] = 20;
        sohag[3] = 25;
        sohag[4] = 30;
        System.out.println(+sohag[4]);
        int len = sohag.length;
        System.out.println(+len);
        // int sum = 0;
        int sum1 = sohag[0] + sohag[4];
        System.out.println(+sum1);
        System.out.println("ARRAY INPUT BY USER!");

        int arif[] = new int[10];
        Scanner input = new Scanner(System.in);
        arif[0] = input.nextInt();
        arif[1] = input.nextInt();
        arif[2] = input.nextInt();
        arif[3] = input.nextInt();
        arif[4] = input.nextInt();
        // int sum=0;
        int sum2 = sohag[0] + arif[3];
        System.out.println("The sum=" + sum2);
        System.out.println("ARRAY INPUT BY USER USING LOOP!");
        int rakib[] = new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            rakib[i] = in.nextInt();
        }
        for (int j = 0; j < 10; j++)
            ;
        {
            System.out.println(+rakib[2]);
        }

    }

}
