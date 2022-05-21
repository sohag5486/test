import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
    public static void main(String[] args) {
        Date date = new Date();
        // System.out.println(date);
        DateFormat sohag = new SimpleDateFormat("dd/MM/YY");
        String rakib = sohag.format(date);
        System.out.println(rakib);

    }
}