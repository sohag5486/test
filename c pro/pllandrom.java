import java.util.Scanner;

public class pllandrom {
    public static void main(String[] args) {
        System.out.println("ENTER YUOUR NUMBER:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp, i, sum = 0, r;
        temp = n;
        ;
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        System.out.println(+sum);
        if (sum == n) {
            System.out.println("The nuber is pelindrom!");
        } else
            System.out.println("The nuber is not pelindrom!");
    }

}
