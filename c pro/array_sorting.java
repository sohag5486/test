import java.util.Arrays;

public class array_sorting {
    public static void main(String[] args) {
        int a[] = { 1, 3, 2, 7, -3 };
        Arrays.sort(a);
        for (int i = 0; i < 5; i++) {
            System.out.print("\n" + a[i]);
        }
        for (int i = 4; i > 0; i--) {
            System.out.print("\n" + a[i]);
        }
    }

}
