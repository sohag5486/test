import java.util.Scanner;

public class forloop {

    public static void main(String[] args)

    {
        System.out.println("Enter your number");
        int n, i;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.println(+i);
        }

        while (i / 2 == 0) {
            System.out.println(+i);
            i++;
        }
    }

}
