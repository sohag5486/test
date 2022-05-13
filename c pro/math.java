import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        System.out.println("Wellcome! To math solution");
        System.out.print("Enter your base:");
        Scanner input = new Scanner(System.in);
        double a, b, area;
        a = input.nextDouble();
        System.out.print("Enter your whide:");
        b = input.nextDouble();
        area = 0.5 * a * b;
        System.out.println("the area is=" + area);

    }
}
