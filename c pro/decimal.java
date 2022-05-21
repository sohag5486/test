import java.text.DecimalFormat;

public class decimal {
    public static void main(String[] args) {
        double x = 12.2324;
        double y = 23.232323;
        DecimalFormat f = new DecimalFormat("0.00");

        System.out.println(f.format(x));
        System.out.printf("%.2f", y);
    }

}
