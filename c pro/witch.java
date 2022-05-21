import java.util.Scanner;

public class witch {
    public static void main(String[] args) {
        System.out.println("Entter your number !");
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        switch (n) {
            case 1:
                System.out.println("your intered number is  !" + n);
                break;
            case 2:
                System.out.println("your intered number is  !" + n);
                break;
            case 3:
                System.out.println("your intered number is  !" + n);
                break;
            case 4:
                System.out.println("your intered number is  !" + n);
                break;
            default:

                System.out.println("your intered number is not value");

        }
    }
}