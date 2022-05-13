import java.util.Scanner;

public class nuber_sum {
    public static void main(String[] orgs) {
        System.out.print("Enter your number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0, r, temp;
        temp = n;
        while (temp != 0) {

            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;

        }
        System.out.print(+sum);
    }

}
